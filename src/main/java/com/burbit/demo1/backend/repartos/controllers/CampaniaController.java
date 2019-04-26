package com.burbit.demo1.backend.repartos.controllers;
import com.burbit.demo1.backend.repartos.entity.Campania;
import com.burbit.demo1.backend.repartos.services.ICampaniaService;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.datatables.mapping.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
/**
* Campania - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/repartos/campania")
public class CampaniaController {
@Autowired
private ICampaniaService campaniaService;
@GetMapping("/findAll")
public List<Campania> findAll() {
return campaniaService.findAll();
}
@RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
public DataTablesOutput<Campania> findAll(@Valid @RequestBody DataTablesInput input) {
return campaniaService.findAll(input);
}
@GetMapping("/findById/{id}")
public ResponseEntity<?> find(@PathVariable Long id)
{
Campania obj = null;
 Map<String, Object> response = new HashMap<>();
try
{
obj = campaniaService.findById(id);
if (obj == null)
{
response.put("mensaje", "El registro : ".concat(id.toString().concat(" no existe en la base de datos!")));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
}
}
catch (DataAccessException e)
{
response.put("mensaje", "Error al realizar la consulta en la base de datos");
response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
}
return new ResponseEntity<Campania>(obj, HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<?> save(@Valid @RequestBody Campania campania)
{
Campania campaniaNew = null;
Map<String, Object> response = new HashMap<>();
try
{
campaniaNew = campaniaService.save(campania);
response.put("mensaje", "El registro ha sido creado con éxito!");
response.put("Campania", campaniaNew);
}
catch (DataAccessException e)
{
response.put("mensaje", "Error al realizar el insert en la base de datos");
response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
}
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
}
@PutMapping("/update/{id}")
public ResponseEntity<?> update(@Valid @RequestBody Campania objParam, @PathVariable Long id)
{
Campania currentObj = this.campaniaService.findById(id);
Campania updatedObj = null;
Map<String, Object> response = new HashMap<>();
if (currentObj == null)
{
response.put("mensaje", "Error: no se pudo editar, el registro ID: "
.concat(id.toString().concat(" no existe en la base de datos!")));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
}
try
{
currentObj.setNombre(objParam.getNombre());
currentObj.setEsActivo(objParam.isEsActivo());
updatedObj = campaniaService.save(currentObj);
response.put("mensaje", "El registro ha sido actualizado con éxito!");
response.put("Campania", updatedObj);
}
catch (DataAccessException e)
{
response.put("mensaje", "Error al actualizar el registro en la base de datos");
response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
}
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable Long id)
{
Map<String, Object> response = new HashMap<>();
try
{
campaniaService.deleteById(id);
response.put("mensaje", "El registro eliminado con éxito!");
}
catch (DataAccessException e)
{
response.put("mensaje", "Error al eliminar el registro de la base de datos");
response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
}
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
}
}

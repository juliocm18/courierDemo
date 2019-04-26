package com.burbit.demo1.backend.repartos.controllers;
import com.burbit.demo1.backend.repartos.entity.Zona;
import com.burbit.demo1.backend.repartos.services.IZonaService;
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
* Zona - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/repartos/zona")
public class ZonaController {
@Autowired
private IZonaService zonaService;
@GetMapping("/findAll")
public List<Zona> findAll() {
return zonaService.findAll();
}
@RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
public DataTablesOutput<Zona> findAll(@Valid @RequestBody DataTablesInput input) {
return zonaService.findAll(input);
}
@GetMapping("/findById/{id}")
public ResponseEntity<?> find(@PathVariable Long id)
{
Zona obj = null;
 Map<String, Object> response = new HashMap<>();
try
{
obj = zonaService.findById(id);
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
return new ResponseEntity<Zona>(obj, HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<?> save(@Valid @RequestBody Zona zona)
{
Zona zonaNew = null;
Map<String, Object> response = new HashMap<>();
try
{
zonaNew = zonaService.save(zona);
response.put("mensaje", "El registro ha sido creado con éxito!");
response.put("Zona", zonaNew);
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
public ResponseEntity<?> update(@Valid @RequestBody Zona objParam, @PathVariable Long id)
{
Zona currentObj = this.zonaService.findById(id);
Zona updatedObj = null;
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
currentObj.setDescripcion(objParam.getDescripcion());
updatedObj = zonaService.save(currentObj);
response.put("mensaje", "El registro ha sido actualizado con éxito!");
response.put("Zona", updatedObj);
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
zonaService.deleteById(id);
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

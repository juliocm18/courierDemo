package com.burbit.demo1.backend.repartos.controllers;
import com.burbit.demo1.backend.repartos.entity.Paquete;
import com.burbit.demo1.backend.repartos.services.IPaqueteService;
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
* Paquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/repartos/paquete")
public class PaqueteController {
@Autowired
private IPaqueteService paqueteService;
@GetMapping("/findAll")
public List<Paquete> findAll() {
return paqueteService.findAll();
}
@RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
public DataTablesOutput<Paquete> findAll(@Valid @RequestBody DataTablesInput input) {
return paqueteService.findAll(input);
}
@GetMapping("/findById/{id}")
public ResponseEntity<?> find(@PathVariable Long id)
{
Paquete obj = null;
 Map<String, Object> response = new HashMap<>();
try
{
obj = paqueteService.findById(id);
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
return new ResponseEntity<Paquete>(obj, HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<?> save(@Valid @RequestBody Paquete paquete)
{
Paquete paqueteNew = null;
Map<String, Object> response = new HashMap<>();
try
{
paqueteNew = paqueteService.save(paquete);
response.put("mensaje", "El registro ha sido creado con éxito!");
response.put("Paquete", paqueteNew);
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
public ResponseEntity<?> update(@Valid @RequestBody Paquete objParam, @PathVariable Long id)
{
Paquete currentObj = this.paqueteService.findById(id);
Paquete updatedObj = null;
Map<String, Object> response = new HashMap<>();
if (currentObj == null)
{
response.put("mensaje", "Error: no se pudo editar, el registro ID: "
.concat(id.toString().concat(" no existe en la base de datos!")));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
}
try
{
currentObj.setCodigo(objParam.getCodigo());
currentObj.setZona(objParam.getZona());
currentObj.setDestinatario(objParam.getDestinatario());
updatedObj = paqueteService.save(currentObj);
response.put("mensaje", "El registro ha sido actualizado con éxito!");
response.put("Paquete", updatedObj);
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
paqueteService.deleteById(id);
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

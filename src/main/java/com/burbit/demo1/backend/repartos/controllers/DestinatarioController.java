package com.burbit.demo1.backend.repartos.controllers;
import com.burbit.demo1.backend.repartos.entity.Destinatario;
import com.burbit.demo1.backend.repartos.services.IDestinatarioService;
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
* Destinatario - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/repartos/destinatario")
public class DestinatarioController {
@Autowired
private IDestinatarioService destinatarioService;
@GetMapping("/findAll")
public List<Destinatario> findAll() {
return destinatarioService.findAll();
}
@RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
public DataTablesOutput<Destinatario> findAll(@Valid @RequestBody DataTablesInput input) {
return destinatarioService.findAll(input);
}
@GetMapping("/findById/{id}")
public ResponseEntity<?> find(@PathVariable Long id)
{
Destinatario obj = null;
 Map<String, Object> response = new HashMap<>();
try
{
obj = destinatarioService.findById(id);
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
return new ResponseEntity<Destinatario>(obj, HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<?> save(@Valid @RequestBody Destinatario destinatario)
{
Destinatario destinatarioNew = null;
Map<String, Object> response = new HashMap<>();
try
{
destinatario.setCondicion((short)1);
destinatarioNew = destinatarioService.save(destinatario);
response.put("mensaje", "El registro ha sido creado con éxito!");
response.put("Destinatario", destinatarioNew);
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
public ResponseEntity<?> update(@Valid @RequestBody Destinatario objParam, @PathVariable Long id)
{
Destinatario currentObj = this.destinatarioService.findById(id);
Destinatario updatedObj = null;
Map<String, Object> response = new HashMap<>();
if (currentObj == null)
{
response.put("mensaje", "Error: no se pudo editar, el registro ID: "
.concat(id.toString().concat(" no existe en la base de datos!")));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
}
try
{
currentObj.setNombres(objParam.getNombres());
currentObj.setNumeroDocumento(objParam.getNumeroDocumento());
currentObj.setCondicion(objParam.getCondicion());
currentObj.setDireccion(objParam.getDireccion());
currentObj.setLatitud(objParam.getLatitud());
currentObj.setLongitud(objParam.getLongitud());
currentObj.setTelefono(objParam.getTelefono());
currentObj.setCelular(objParam.getCelular());
currentObj.setCiudad(objParam.getCiudad());
currentObj.setUbicacion(objParam.getUbicacion());
updatedObj = destinatarioService.save(currentObj);
response.put("mensaje", "El registro ha sido actualizado con éxito!");
response.put("Destinatario", updatedObj);
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
destinatarioService.deleteById(id);
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

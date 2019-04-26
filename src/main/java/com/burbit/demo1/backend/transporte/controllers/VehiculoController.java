package com.burbit.demo1.backend.transporte.controllers;
import com.burbit.demo1.backend.transporte.entity.Vehiculo;
import com.burbit.demo1.backend.transporte.services.IVehiculoService;
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
* Vehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transporte/vehiculo")
public class VehiculoController {
@Autowired
private IVehiculoService vehiculoService;
@GetMapping("/findAll")
public List<Vehiculo> findAll() {
return vehiculoService.findAll();
}
@RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
public DataTablesOutput<Vehiculo> findAll(@Valid @RequestBody DataTablesInput input) {
return vehiculoService.findAll(input);
}
@GetMapping("/findById/{id}")
public ResponseEntity<?> find(@PathVariable Long id)
{
Vehiculo obj = null;
 Map<String, Object> response = new HashMap<>();
try
{
obj = vehiculoService.findById(id);
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
return new ResponseEntity<Vehiculo>(obj, HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<?> save(@Valid @RequestBody Vehiculo vehiculo)
{
Vehiculo vehiculoNew = null;
Map<String, Object> response = new HashMap<>();
try
{
vehiculo.setCondicion((short)1);
vehiculoNew = vehiculoService.save(vehiculo);
response.put("mensaje", "El registro ha sido creado con éxito!");
response.put("Vehiculo", vehiculoNew);
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
public ResponseEntity<?> update(@Valid @RequestBody Vehiculo objParam, @PathVariable Long id)
{
Vehiculo currentObj = this.vehiculoService.findById(id);
Vehiculo updatedObj = null;
Map<String, Object> response = new HashMap<>();
if (currentObj == null)
{
response.put("mensaje", "Error: no se pudo editar, el registro ID: "
.concat(id.toString().concat(" no existe en la base de datos!")));
return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
}
try
{
currentObj.setPlaca(objParam.getPlaca());
currentObj.setCertificado(objParam.getCertificado());
currentObj.setTipoVehiculo(objParam.getTipoVehiculo());
currentObj.setCondicion(objParam.getCondicion());
currentObj.setMarcaVehiculo(objParam.getMarcaVehiculo());
updatedObj = vehiculoService.save(currentObj);
response.put("mensaje", "El registro ha sido actualizado con éxito!");
response.put("Vehiculo", updatedObj);
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
vehiculoService.deleteById(id);
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

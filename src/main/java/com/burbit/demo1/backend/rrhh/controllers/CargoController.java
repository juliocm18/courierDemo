package com.burbit.demo1.backend.rrhh.controllers;

import com.burbit.demo1.backend.rrhh.entity.Cargo;
import com.burbit.demo1.backend.rrhh.services.ICargoService;
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
 * Cargo -
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rrhh/cargo")
public class CargoController {

    @Autowired
    private ICargoService cargoService;

    @GetMapping("/findAll")
    public List<Cargo> findAll() {
        return cargoService.findAll();
    }

    @RequestMapping(value = "/findAllPaged", method = RequestMethod.POST)
    public DataTablesOutput<Cargo> findAll(@Valid @RequestBody DataTablesInput input) {
        return cargoService.findAll(input);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        Cargo obj = null;
        Map<String, Object> response = new HashMap<>();
        try {
            obj = cargoService.findById(id);
            if (obj == null) {
                response.put("mensaje", "El registro : ".concat(id.toString().concat(" no existe en la base de datos!")));
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
            }
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Cargo>(obj, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@Valid @RequestBody Cargo cargo) {
        Cargo cargoNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            cargo.setCondicion((short) 1);
            cargoNew = cargoService.save(cargo);
            response.put("mensaje", "El registro ha sido creado con éxito!");
            response.put("Cargo", cargoNew);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Cargo objParam, @PathVariable Long id) {
        Cargo currentObj = this.cargoService.findById(id);
        Cargo updatedObj = null;
        Map<String, Object> response = new HashMap<>();
        if (currentObj == null) {
            response.put("mensaje", "Error: no se pudo editar, el registro ID: "
                    .concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        try {
            currentObj.setArea(objParam.getArea());
            currentObj.setNombre(objParam.getNombre());
            currentObj.setDescripcion(objParam.getDescripcion());
            currentObj.setCondicion(objParam.getCondicion());
            updatedObj = cargoService.save(currentObj);
            response.put("mensaje", "El registro ha sido actualizado con éxito!");
            response.put("Cargo", updatedObj);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al actualizar el registro en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            cargoService.deleteById(id);
            response.put("mensaje", "El registro eliminado con éxito!");
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al eliminar el registro de la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}

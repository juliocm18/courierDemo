package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.Vehiculo;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Vehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IVehiculoService {
public List<Vehiculo> findAll();
public Vehiculo save(Vehiculo obj);
public Vehiculo findById(Long id);
public void delete(Vehiculo obj);
public void deleteById(Long id);
public DataTablesOutput<Vehiculo> findAll(DataTablesInput input);
}

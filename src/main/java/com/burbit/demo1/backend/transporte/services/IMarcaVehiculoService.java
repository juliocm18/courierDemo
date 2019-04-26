package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.MarcaVehiculo;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* MarcaVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IMarcaVehiculoService {
public List<MarcaVehiculo> findAll();
public MarcaVehiculo save(MarcaVehiculo obj);
public MarcaVehiculo findById(Long id);
public void delete(MarcaVehiculo obj);
public void deleteById(Long id);
public DataTablesOutput<MarcaVehiculo> findAll(DataTablesInput input);
}

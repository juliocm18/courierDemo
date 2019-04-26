package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.TipoVehiculo;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* TipoVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface ITipoVehiculoService {
public List<TipoVehiculo> findAll();
public TipoVehiculo save(TipoVehiculo obj);
public TipoVehiculo findById(Long id);
public void delete(TipoVehiculo obj);
public void deleteById(Long id);
public DataTablesOutput<TipoVehiculo> findAll(DataTablesInput input);
}

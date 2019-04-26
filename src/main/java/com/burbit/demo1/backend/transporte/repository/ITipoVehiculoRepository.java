package com.burbit.demo1.backend.transporte.repository;
import com.burbit.demo1.backend.transporte.entity.TipoVehiculo;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* TipoVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface ITipoVehiculoRepository extends DataTablesRepository<TipoVehiculo,Long>{}

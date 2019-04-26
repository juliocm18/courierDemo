package com.burbit.demo1.backend.transporte.repository;
import com.burbit.demo1.backend.transporte.entity.MarcaVehiculo;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* MarcaVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IMarcaVehiculoRepository extends DataTablesRepository<MarcaVehiculo,Long>{}

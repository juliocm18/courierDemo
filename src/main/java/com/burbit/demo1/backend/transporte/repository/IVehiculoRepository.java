package com.burbit.demo1.backend.transporte.repository;
import com.burbit.demo1.backend.transporte.entity.Vehiculo;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* Vehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IVehiculoRepository extends DataTablesRepository<Vehiculo,Long>{}

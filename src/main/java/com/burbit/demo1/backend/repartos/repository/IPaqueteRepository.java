package com.burbit.demo1.backend.repartos.repository;
import com.burbit.demo1.backend.repartos.entity.Paquete;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* Paquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IPaqueteRepository extends DataTablesRepository<Paquete,Long>{}

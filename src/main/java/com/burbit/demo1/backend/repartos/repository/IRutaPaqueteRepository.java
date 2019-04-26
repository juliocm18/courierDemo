package com.burbit.demo1.backend.repartos.repository;
import com.burbit.demo1.backend.repartos.entity.RutaPaquete;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* RutaPaquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IRutaPaqueteRepository extends DataTablesRepository<RutaPaquete,Long>{}

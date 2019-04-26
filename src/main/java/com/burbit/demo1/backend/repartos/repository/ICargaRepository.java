package com.burbit.demo1.backend.repartos.repository;
import com.burbit.demo1.backend.repartos.entity.Carga;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* Carga - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface ICargaRepository extends DataTablesRepository<Carga,Long>{}

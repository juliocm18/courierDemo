package com.burbit.demo1.backend.repartos.repository;
import com.burbit.demo1.backend.repartos.entity.Destinatario;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* Destinatario - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IDestinatarioRepository extends DataTablesRepository<Destinatario,Long>{}

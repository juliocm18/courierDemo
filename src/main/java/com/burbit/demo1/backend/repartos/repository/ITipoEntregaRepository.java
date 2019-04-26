package com.burbit.demo1.backend.repartos.repository;
import com.burbit.demo1.backend.repartos.entity.TipoEntrega;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* TipoEntrega - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface ITipoEntregaRepository extends DataTablesRepository<TipoEntrega,Long>{}

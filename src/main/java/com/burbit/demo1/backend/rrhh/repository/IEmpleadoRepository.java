package com.burbit.demo1.backend.rrhh.repository;
import com.burbit.demo1.backend.rrhh.entity.Empleado;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
/**
* Empleado - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IEmpleadoRepository extends DataTablesRepository<Empleado,Long>{}

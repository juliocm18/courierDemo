package com.burbit.demo1.backend.rrhh.services;
import com.burbit.demo1.backend.rrhh.entity.Empleado;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Empleado - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IEmpleadoService {
public List<Empleado> findAll();
public Empleado save(Empleado obj);
public Empleado findById(Long id);
public void delete(Empleado obj);
public void deleteById(Long id);
public DataTablesOutput<Empleado> findAll(DataTablesInput input);
}

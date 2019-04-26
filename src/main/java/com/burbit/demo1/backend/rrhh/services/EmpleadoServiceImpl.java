package com.burbit.demo1.backend.rrhh.services;
import com.burbit.demo1.backend.rrhh.entity.Empleado;
import com.burbit.demo1.backend.rrhh.repository.IEmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Empleado - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
@Autowired
private IEmpleadoRepository empleadoRepository;
@Override
@Transactional(readOnly = true)
public List<Empleado> findAll() {
return (List<Empleado>) empleadoRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Empleado> findAll(DataTablesInput input) {
return (DataTablesOutput<Empleado>) empleadoRepository.findAll(input);
}
@Override
@Transactional
public Empleado save(Empleado obj) {
return empleadoRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Empleado findById(Long id) {
return empleadoRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Empleado obj) {
empleadoRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
empleadoRepository.deleteById(id);
}
}

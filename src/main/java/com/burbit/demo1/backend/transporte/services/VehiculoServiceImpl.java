package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.Vehiculo;
import com.burbit.demo1.backend.transporte.repository.IVehiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Vehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class VehiculoServiceImpl implements IVehiculoService{
@Autowired
private IVehiculoRepository vehiculoRepository;
@Override
@Transactional(readOnly = true)
public List<Vehiculo> findAll() {
return (List<Vehiculo>) vehiculoRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Vehiculo> findAll(DataTablesInput input) {
return (DataTablesOutput<Vehiculo>) vehiculoRepository.findAll(input);
}
@Override
@Transactional
public Vehiculo save(Vehiculo obj) {
return vehiculoRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Vehiculo findById(Long id) {
return vehiculoRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Vehiculo obj) {
vehiculoRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
vehiculoRepository.deleteById(id);
}
}

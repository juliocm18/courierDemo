package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.MarcaVehiculo;
import com.burbit.demo1.backend.transporte.repository.IMarcaVehiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* MarcaVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class MarcaVehiculoServiceImpl implements IMarcaVehiculoService{
@Autowired
private IMarcaVehiculoRepository marcaVehiculoRepository;
@Override
@Transactional(readOnly = true)
public List<MarcaVehiculo> findAll() {
return (List<MarcaVehiculo>) marcaVehiculoRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<MarcaVehiculo> findAll(DataTablesInput input) {
return (DataTablesOutput<MarcaVehiculo>) marcaVehiculoRepository.findAll(input);
}
@Override
@Transactional
public MarcaVehiculo save(MarcaVehiculo obj) {
return marcaVehiculoRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public MarcaVehiculo findById(Long id) {
return marcaVehiculoRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(MarcaVehiculo obj) {
marcaVehiculoRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
marcaVehiculoRepository.deleteById(id);
}
}

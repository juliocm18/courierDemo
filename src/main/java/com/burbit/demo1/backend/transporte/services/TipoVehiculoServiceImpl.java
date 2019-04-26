package com.burbit.demo1.backend.transporte.services;
import com.burbit.demo1.backend.transporte.entity.TipoVehiculo;
import com.burbit.demo1.backend.transporte.repository.ITipoVehiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* TipoVehiculo - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class TipoVehiculoServiceImpl implements ITipoVehiculoService{
@Autowired
private ITipoVehiculoRepository tipoVehiculoRepository;
@Override
@Transactional(readOnly = true)
public List<TipoVehiculo> findAll() {
return (List<TipoVehiculo>) tipoVehiculoRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<TipoVehiculo> findAll(DataTablesInput input) {
return (DataTablesOutput<TipoVehiculo>) tipoVehiculoRepository.findAll(input);
}
@Override
@Transactional
public TipoVehiculo save(TipoVehiculo obj) {
return tipoVehiculoRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public TipoVehiculo findById(Long id) {
return tipoVehiculoRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(TipoVehiculo obj) {
tipoVehiculoRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
tipoVehiculoRepository.deleteById(id);
}
}

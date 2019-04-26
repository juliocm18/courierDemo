package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Carga;
import com.burbit.demo1.backend.repartos.repository.ICargaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Carga - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class CargaServiceImpl implements ICargaService{
@Autowired
private ICargaRepository cargaRepository;
@Override
@Transactional(readOnly = true)
public List<Carga> findAll() {
return (List<Carga>) cargaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Carga> findAll(DataTablesInput input) {
return (DataTablesOutput<Carga>) cargaRepository.findAll(input);
}
@Override
@Transactional
public Carga save(Carga obj) {
return cargaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Carga findById(Long id) {
return cargaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Carga obj) {
cargaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
cargaRepository.deleteById(id);
}
}

package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Paquete;
import com.burbit.demo1.backend.repartos.repository.IPaqueteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Paquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class PaqueteServiceImpl implements IPaqueteService{
@Autowired
private IPaqueteRepository paqueteRepository;
@Override
@Transactional(readOnly = true)
public List<Paquete> findAll() {
return (List<Paquete>) paqueteRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Paquete> findAll(DataTablesInput input) {
return (DataTablesOutput<Paquete>) paqueteRepository.findAll(input);
}
@Override
@Transactional
public Paquete save(Paquete obj) {
return paqueteRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Paquete findById(Long id) {
return paqueteRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Paquete obj) {
paqueteRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
paqueteRepository.deleteById(id);
}
}

package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.RutaPaquete;
import com.burbit.demo1.backend.repartos.repository.IRutaPaqueteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* RutaPaquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class RutaPaqueteServiceImpl implements IRutaPaqueteService{
@Autowired
private IRutaPaqueteRepository rutaPaqueteRepository;
@Override
@Transactional(readOnly = true)
public List<RutaPaquete> findAll() {
return (List<RutaPaquete>) rutaPaqueteRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<RutaPaquete> findAll(DataTablesInput input) {
return (DataTablesOutput<RutaPaquete>) rutaPaqueteRepository.findAll(input);
}
@Override
@Transactional
public RutaPaquete save(RutaPaquete obj) {
return rutaPaqueteRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public RutaPaquete findById(Long id) {
return rutaPaqueteRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(RutaPaquete obj) {
rutaPaqueteRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
rutaPaqueteRepository.deleteById(id);
}
}

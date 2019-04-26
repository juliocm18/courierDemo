package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Destinatario;
import com.burbit.demo1.backend.repartos.repository.IDestinatarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Destinatario - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class DestinatarioServiceImpl implements IDestinatarioService{
@Autowired
private IDestinatarioRepository destinatarioRepository;
@Override
@Transactional(readOnly = true)
public List<Destinatario> findAll() {
return (List<Destinatario>) destinatarioRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Destinatario> findAll(DataTablesInput input) {
return (DataTablesOutput<Destinatario>) destinatarioRepository.findAll(input);
}
@Override
@Transactional
public Destinatario save(Destinatario obj) {
return destinatarioRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Destinatario findById(Long id) {
return destinatarioRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Destinatario obj) {
destinatarioRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
destinatarioRepository.deleteById(id);
}
}

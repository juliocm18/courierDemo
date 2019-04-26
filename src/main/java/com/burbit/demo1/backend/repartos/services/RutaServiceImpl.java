package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Ruta;
import com.burbit.demo1.backend.repartos.repository.IRutaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Ruta - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class RutaServiceImpl implements IRutaService{
@Autowired
private IRutaRepository rutaRepository;
@Override
@Transactional(readOnly = true)
public List<Ruta> findAll() {
return (List<Ruta>) rutaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Ruta> findAll(DataTablesInput input) {
return (DataTablesOutput<Ruta>) rutaRepository.findAll(input);
}
@Override
@Transactional
public Ruta save(Ruta obj) {
return rutaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Ruta findById(Long id) {
return rutaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Ruta obj) {
rutaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
rutaRepository.deleteById(id);
}
}

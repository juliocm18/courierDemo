package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Campania;
import com.burbit.demo1.backend.repartos.repository.ICampaniaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Campania - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class CampaniaServiceImpl implements ICampaniaService{
@Autowired
private ICampaniaRepository campaniaRepository;
@Override
@Transactional(readOnly = true)
public List<Campania> findAll() {
return (List<Campania>) campaniaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Campania> findAll(DataTablesInput input) {
return (DataTablesOutput<Campania>) campaniaRepository.findAll(input);
}
@Override
@Transactional
public Campania save(Campania obj) {
return campaniaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Campania findById(Long id) {
return campaniaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Campania obj) {
campaniaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
campaniaRepository.deleteById(id);
}
}

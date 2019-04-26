package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Entrega;
import com.burbit.demo1.backend.repartos.repository.IEntregaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Entrega - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class EntregaServiceImpl implements IEntregaService{
@Autowired
private IEntregaRepository entregaRepository;
@Override
@Transactional(readOnly = true)
public List<Entrega> findAll() {
return (List<Entrega>) entregaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Entrega> findAll(DataTablesInput input) {
return (DataTablesOutput<Entrega>) entregaRepository.findAll(input);
}
@Override
@Transactional
public Entrega save(Entrega obj) {
return entregaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Entrega findById(Long id) {
return entregaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Entrega obj) {
entregaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
entregaRepository.deleteById(id);
}
}

package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.TipoEntrega;
import com.burbit.demo1.backend.repartos.repository.ITipoEntregaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* TipoEntrega - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class TipoEntregaServiceImpl implements ITipoEntregaService{
@Autowired
private ITipoEntregaRepository tipoEntregaRepository;
@Override
@Transactional(readOnly = true)
public List<TipoEntrega> findAll() {
return (List<TipoEntrega>) tipoEntregaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<TipoEntrega> findAll(DataTablesInput input) {
return (DataTablesOutput<TipoEntrega>) tipoEntregaRepository.findAll(input);
}
@Override
@Transactional
public TipoEntrega save(TipoEntrega obj) {
return tipoEntregaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public TipoEntrega findById(Long id) {
return tipoEntregaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(TipoEntrega obj) {
tipoEntregaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
tipoEntregaRepository.deleteById(id);
}
}

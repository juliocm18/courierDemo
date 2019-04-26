package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.DetalleCarga;
import com.burbit.demo1.backend.repartos.repository.IDetalleCargaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* DetalleCarga - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
@Service
public class DetalleCargaServiceImpl implements IDetalleCargaService{
@Autowired
private IDetalleCargaRepository detalleCargaRepository;
@Override
@Transactional(readOnly = true)
public List<DetalleCarga> findAll() {
return (List<DetalleCarga>) detalleCargaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<DetalleCarga> findAll(DataTablesInput input) {
return (DataTablesOutput<DetalleCarga>) detalleCargaRepository.findAll(input);
}
@Override
@Transactional
public DetalleCarga save(DetalleCarga obj) {
return detalleCargaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public DetalleCarga findById(Long id) {
return detalleCargaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(DetalleCarga obj) {
detalleCargaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
detalleCargaRepository.deleteById(id);
}
}

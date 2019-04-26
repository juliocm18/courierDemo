package com.burbit.demo1.backend.rrhh.services;
import com.burbit.demo1.backend.rrhh.entity.Area;
import com.burbit.demo1.backend.rrhh.repository.IAreaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Area - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
@Service
public class AreaServiceImpl implements IAreaService{
@Autowired
private IAreaRepository areaRepository;
@Override
@Transactional(readOnly = true)
public List<Area> findAll() {
return (List<Area>) areaRepository.findAll();
}
@Override
@Transactional(readOnly = true)
public DataTablesOutput<Area> findAll(DataTablesInput input) {
return (DataTablesOutput<Area>) areaRepository.findAll(input);
}
@Override
@Transactional
public Area save(Area obj) {
return areaRepository.save(obj);
}
@Override
@Transactional(readOnly = true)
public Area findById(Long id) {
return areaRepository.findById(id).orElse(null);
}
@Override
@Transactional
public void delete(Area obj) {
areaRepository.delete(obj);
}
@Override
@Transactional
public void deleteById(Long id) {
areaRepository.deleteById(id);
}
}

package com.burbit.demo1.backend.rrhh.services;
import com.burbit.demo1.backend.rrhh.entity.Area;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Area - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IAreaService {
public List<Area> findAll();
public Area save(Area obj);
public Area findById(Long id);
public void delete(Area obj);
public void deleteById(Long id);
public DataTablesOutput<Area> findAll(DataTablesInput input);
}

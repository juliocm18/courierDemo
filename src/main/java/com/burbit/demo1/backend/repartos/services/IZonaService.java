package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Zona;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Zona - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IZonaService {
public List<Zona> findAll();
public Zona save(Zona obj);
public Zona findById(Long id);
public void delete(Zona obj);
public void deleteById(Long id);
public DataTablesOutput<Zona> findAll(DataTablesInput input);
}

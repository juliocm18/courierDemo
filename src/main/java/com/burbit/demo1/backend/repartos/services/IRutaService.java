package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Ruta;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Ruta - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IRutaService {
public List<Ruta> findAll();
public Ruta save(Ruta obj);
public Ruta findById(Long id);
public void delete(Ruta obj);
public void deleteById(Long id);
public DataTablesOutput<Ruta> findAll(DataTablesInput input);
}

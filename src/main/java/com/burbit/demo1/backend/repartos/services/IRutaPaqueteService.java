package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.RutaPaquete;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* RutaPaquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface IRutaPaqueteService {
public List<RutaPaquete> findAll();
public RutaPaquete save(RutaPaquete obj);
public RutaPaquete findById(Long id);
public void delete(RutaPaquete obj);
public void deleteById(Long id);
public DataTablesOutput<RutaPaquete> findAll(DataTablesInput input);
}

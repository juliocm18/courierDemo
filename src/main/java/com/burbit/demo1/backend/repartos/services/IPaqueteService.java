package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Paquete;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Paquete - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IPaqueteService {
public List<Paquete> findAll();
public Paquete save(Paquete obj);
public Paquete findById(Long id);
public void delete(Paquete obj);
public void deleteById(Long id);
public DataTablesOutput<Paquete> findAll(DataTablesInput input);
}

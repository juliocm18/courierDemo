package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Carga;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Carga - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface ICargaService {
public List<Carga> findAll();
public Carga save(Carga obj);
public Carga findById(Long id);
public void delete(Carga obj);
public void deleteById(Long id);
public DataTablesOutput<Carga> findAll(DataTablesInput input);
}

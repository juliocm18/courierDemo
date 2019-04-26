package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Campania;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Campania - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface ICampaniaService {
public List<Campania> findAll();
public Campania save(Campania obj);
public Campania findById(Long id);
public void delete(Campania obj);
public void deleteById(Long id);
public DataTablesOutput<Campania> findAll(DataTablesInput input);
}

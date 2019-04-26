package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.Destinatario;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* Destinatario - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IDestinatarioService {
public List<Destinatario> findAll();
public Destinatario save(Destinatario obj);
public Destinatario findById(Long id);
public void delete(Destinatario obj);
public void deleteById(Long id);
public DataTablesOutput<Destinatario> findAll(DataTablesInput input);
}

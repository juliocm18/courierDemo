package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.TipoEntrega;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* TipoEntrega - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:48 
*/
public interface ITipoEntregaService {
public List<TipoEntrega> findAll();
public TipoEntrega save(TipoEntrega obj);
public TipoEntrega findById(Long id);
public void delete(TipoEntrega obj);
public void deleteById(Long id);
public DataTablesOutput<TipoEntrega> findAll(DataTablesInput input);
}

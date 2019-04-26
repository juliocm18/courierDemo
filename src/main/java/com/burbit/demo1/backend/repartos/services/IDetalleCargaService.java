package com.burbit.demo1.backend.repartos.services;
import com.burbit.demo1.backend.repartos.entity.DetalleCarga;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
/**
* DetalleCarga - 
*
* @author Julio Becerra Urbina
* @since 1.0 - fecha: 23 abril 2019 - 18:29:47 
*/
public interface IDetalleCargaService {
public List<DetalleCarga> findAll();
public DetalleCarga save(DetalleCarga obj);
public DetalleCarga findById(Long id);
public void delete(DetalleCarga obj);
public void deleteById(Long id);
public DataTablesOutput<DetalleCarga> findAll(DataTablesInput input);
}

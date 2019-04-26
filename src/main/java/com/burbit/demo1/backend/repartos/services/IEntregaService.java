package com.burbit.demo1.backend.repartos.services;

import com.burbit.demo1.backend.repartos.entity.Entrega;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

/**
 * Entrega -
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:47
 */
public interface IEntregaService {

    public List<Entrega> findAll();

    public Entrega save(Entrega obj);

    public Entrega findById(Long id);

    public void delete(Entrega obj);

    public void deleteById(Long id);

    public DataTablesOutput<Entrega> findAll(DataTablesInput input);
}

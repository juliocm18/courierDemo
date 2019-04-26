package com.burbit.demo1.backend.rrhh.services;

import com.burbit.demo1.backend.rrhh.entity.Cargo;
import java.util.List;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

/**
 * Cargo -
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
public interface ICargoService {

    public List<Cargo> findAll();

    public Cargo save(Cargo obj);

    public Cargo findById(Long id);

    public void delete(Cargo obj);

    public void deleteById(Long id);

    public DataTablesOutput<Cargo> findAll(DataTablesInput input);
}

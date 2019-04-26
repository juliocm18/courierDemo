package com.burbit.demo1.backend.rrhh.services;

import com.burbit.demo1.backend.rrhh.entity.Cargo;
import com.burbit.demo1.backend.rrhh.repository.ICargoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

/**
 * Cargo -
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
@Service
public class CargoServiceImpl implements ICargoService {

    @Autowired
    private ICargoRepository cargoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cargo> findAll() {
        return (List<Cargo>) cargoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DataTablesOutput<Cargo> findAll(DataTablesInput input) {
        return (DataTablesOutput<Cargo>) cargoRepository.findAll(input);
    }

    @Override
    @Transactional
    public Cargo save(Cargo obj) {
        return cargoRepository.save(obj);
    }

    @Override
    @Transactional(readOnly = true)
    public Cargo findById(Long id) {
        return cargoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Cargo obj) {
        cargoRepository.delete(obj);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        cargoRepository.deleteById(id);
    }
}

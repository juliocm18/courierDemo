package com.burbit.demo1.backend.repartos.services;

import com.burbit.demo1.backend.repartos.entity.Zona;
import com.burbit.demo1.backend.repartos.repository.IZonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

/**
 * Zona -
 *
 * @author Julio Becerra Urbina
 * @since 1.0 - fecha: 23 abril 2019 - 18:29:48
 */
@Service
public class ZonaServiceImpl implements IZonaService {

    @Autowired
    private IZonaRepository zonaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Zona> findAll() {
        return (List<Zona>) zonaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DataTablesOutput<Zona> findAll(DataTablesInput input) {
        return (DataTablesOutput<Zona>) zonaRepository.findAll(input);
    }

    @Override
    @Transactional
    public Zona save(Zona obj) {
        return zonaRepository.save(obj);
    }

    @Override
    @Transactional(readOnly = true)
    public Zona findById(Long id) {
        return zonaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Zona obj) {
        zonaRepository.delete(obj);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        zonaRepository.deleteById(id);
    }
}

package com.iasi.iasi.repository;

import java.util.List;
import com.iasi.iasi.model.Empresa;

public interface EmpresaRepository {
    int save(Empresa book);

    int update(Empresa book);

    Empresa findById(Long id);

    int deleteById(Long id);

    List<Empresa> findAll();

    List<Empresa> findByNameContaining(String nome);

    int deleteAll();
}

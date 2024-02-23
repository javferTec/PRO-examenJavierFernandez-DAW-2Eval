package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

import java.util.List;

public interface DirectorDao {
    List<DirectorEntity> findAll();

    DirectorEntity findById(int id);
}

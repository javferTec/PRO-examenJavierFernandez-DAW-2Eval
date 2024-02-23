package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.ActorEntity;

import java.util.List;

public interface ActorDao {

    List<ActorEntity> findAll();

    ActorEntity findById(int id);
}

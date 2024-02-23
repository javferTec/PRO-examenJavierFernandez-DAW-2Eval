package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Actor;
import com.fpmislata.examen2.persistence.dao.entity.ActorEntity;

import java.util.ArrayList;
import java.util.List;

public class ActorMapper {
    public static Actor toActor(ActorEntity actorEntity) {
        return new Actor(
                actorEntity.getId(),
                actorEntity.getName()
        );
    }

    public static List<Actor> actorList(List<ActorEntity> actorEntityList) {
        List<Actor> actorList = new ArrayList<>();
        for (ActorEntity actorEntity : actorEntityList) {
            actorList.add(toActor(actorEntity));
        }
        return actorList;
    }

}

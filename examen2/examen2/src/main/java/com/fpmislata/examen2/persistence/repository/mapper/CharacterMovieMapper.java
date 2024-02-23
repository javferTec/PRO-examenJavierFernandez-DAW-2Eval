package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;

import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {
    public static CharacterMovie toCharacter(CharacterMovieEntity characterMovieEntity) {
        return new CharacterMovie(
                characterMovieEntity.getId()
                //characterMovieEntity.getMovie(),
                //characterMovieEntity.getActor()
        );
    }

    public static List<CharacterMovie> toCharacterMovieList(List<CharacterMovieEntity> characterMovieEntityList) {
        List<CharacterMovie> characterMovieList = new ArrayList<>();
        for (CharacterMovieEntity characterMovieEntity : characterMovieEntityList) {
            characterMovieList.add(toCharacter(characterMovieEntity));
        }
        return characterMovieList;
    }
}

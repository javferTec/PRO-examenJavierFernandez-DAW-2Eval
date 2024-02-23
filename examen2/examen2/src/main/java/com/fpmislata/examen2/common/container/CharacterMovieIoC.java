package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.dao.impl.CharacterMovieDaoImpl;

public class CharacterMovieIoC {
    private static CharacterMovieDao characterDao;

    public static CharacterMovieDao getCharacterDao() {
        if (characterDao == null) {
            characterDao = new CharacterMovieDaoImpl();
        }
        return characterDao;
    }
}

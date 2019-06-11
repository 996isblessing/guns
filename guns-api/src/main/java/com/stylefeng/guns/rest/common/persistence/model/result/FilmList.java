package com.stylefeng.guns.rest.common.persistence.model.result;

import java.io.Serializable;
import java.util.List;

public class FilmList implements Serializable {
    int filmId;
    String filmName;
    String filmLength;
    String filmType;
    String filmCats;
    String actors;
    String imgAddress;
    List filmFields;

}

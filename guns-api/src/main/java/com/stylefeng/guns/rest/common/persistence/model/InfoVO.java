package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;

public class InfoVO  implements Serializable {
    String biography;
    ActorsVO actors;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public ActorsVO getActors() {
        return actors;
    }

    public void setActors(ActorsVO actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "InfoVO{" +
                "biography='" + biography + '\'' +
                ", actors=" + actors +
                '}';
    }
}

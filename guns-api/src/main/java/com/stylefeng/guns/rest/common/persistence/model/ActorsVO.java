package com.stylefeng.guns.rest.common.persistence.model;

import java.io.Serializable;
import java.util.List;

public class ActorsVO implements Serializable {
    DirectorVO director;
    List<InnerActorsVO> actors;

    public DirectorVO getDirector() {
        return director;
    }

    public void setDirector(DirectorVO director) {
        this.director = director;
    }

    public List<InnerActorsVO> getActors() {
        return actors;
    }

    public void setActors(List<InnerActorsVO> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "ActorsVO{" +
                "director=" + director +
                ", actors=" + actors +
                '}';
    }
}

package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;
import java.util.List;

public class FilmConditionVoW implements Serializable {
    List<CatVoW> catInfo;
    List<SourceVoW> sourceInfo;
    List<YearVoW> yearInfo;

    @Override
    public String toString() {
        return "FilmConditionVoW{" +
                "catInfo=" + catInfo +
                ", sourceInfo=" + sourceInfo +
                ", yearInfo=" + yearInfo +
                '}';
    }

    public List<CatVoW> getCatInfo() {
        return catInfo;
    }

    public void setCatInfo(List<CatVoW> catInfo) {
        this.catInfo = catInfo;
    }

    public List<SourceVoW> getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(List<SourceVoW> sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public List<YearVoW> getYearInfo() {
        return yearInfo;
    }

    public void setYearInfo(List<YearVoW> yearInfo) {
        this.yearInfo = yearInfo;
    }
}

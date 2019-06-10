package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;
import java.util.List;

public class FilmConditionVo implements Serializable {
    List<CatVo> catInfo;
    List<SourceVo> sourceInfo;
    List<YearVo> yearInfo;

    @Override
    public String toString() {
        return "FilmConditionVo{" +
                "catInfo=" + catInfo +
                ", sourceInfo=" + sourceInfo +
                ", yearInfo=" + yearInfo +
                '}';
    }

    public List<CatVo> getCatInfo() {
        return catInfo;
    }

    public void setCatInfo(List<CatVo> catInfo) {
        this.catInfo = catInfo;
    }

    public List<SourceVo> getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(List<SourceVo> sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public List<YearVo> getYearInfo() {
        return yearInfo;
    }

    public void setYearInfo(List<YearVo> yearInfo) {
        this.yearInfo = yearInfo;
    }
}

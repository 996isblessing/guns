package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;

public class ConditionResult implements Serializable {
    int status;
    FilmConditionVoW data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public FilmConditionVoW getData() {
        return data;
    }

    public void setData(FilmConditionVoW data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ConditionResult{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}

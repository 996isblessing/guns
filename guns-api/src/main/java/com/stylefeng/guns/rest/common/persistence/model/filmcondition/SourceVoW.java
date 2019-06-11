package com.stylefeng.guns.rest.common.persistence.model.filmcondition;

import java.io.Serializable;

public class SourceVoW implements Serializable {
    String sourceId;
    String sourceName;
    boolean isActive = true;

    @Override
    public String toString() {
        return "SourceVoW{" +
                "sourceId='" + sourceId + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

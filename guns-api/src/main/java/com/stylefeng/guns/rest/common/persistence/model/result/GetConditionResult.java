package com.stylefeng.guns.rest.common.persistence.model.result;

public class GetConditionResult extends Result {
    Object data;

    public GetConditionResult() {
    }

    public GetConditionResult(int status, Object data) {
        super(status);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetConditionResult{" +
                "data=" + data +
                ", status=" + status +
                '}';
    }
}

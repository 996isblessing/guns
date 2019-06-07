package com.stylefeng.guns.rest.modular.cinema.model;

public class GetConditionResult extends Result {
    private static final long serialVersionUID = 2429639843577150446L;
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

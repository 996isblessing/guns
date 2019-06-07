package com.stylefeng.guns.rest.modular.cinema.model;

/**
 * @author Keniefu
 */
public class ExceptionResult extends Result {
    private static final long serialVersionUID = -2363725860076181726L;
    String msg;

    public ExceptionResult() {
    }

    public ExceptionResult(int status, String msg) {
        super(status);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ExceptionResult{" +
                "msg='" + msg + '\'' +
                "status=" + status +
                '}';
    }
}

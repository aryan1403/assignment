package com.example.demo;

public class response {
    String responsecode;
    String msg;
    public String getResponsecode() {
        return responsecode;
    }
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getOb() {
        return ob;
    }
    public void setOb(Object ob) {
        this.ob = ob;
    }
    Object ob;
    public response(String responsecode, String msg, Object ob) {
        this.responsecode = responsecode;
        this.msg = msg;
        this.ob = ob;
    }
}

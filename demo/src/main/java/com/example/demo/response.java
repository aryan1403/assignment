package com.example.demo;

public class response {
    String responsecode;
    String msg;
    Object ob;
    public response(String responsecode, String msg, Object ob) {
        this.responsecode = responsecode;
        this.msg = msg;
        this.ob = ob;
    }
}

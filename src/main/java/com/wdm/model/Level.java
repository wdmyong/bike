package com.wdm.model;

public enum Level {

    LOW(0, "low"),
    MID(1, "mid"),
    HIGH(2, "high");

    private int code;
    private String name;
    private Level(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

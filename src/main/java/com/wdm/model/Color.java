package com.wdm.model;

public enum Color {

    BLACK(3, "black"),
    YELLOW(2, "yellow"),
    RED(1, "red"),
    DEFAULT(0, "no color");

    private int code;
    private String word;

    private Color(int code, String word) {
        this.code = code;
        this.word = word;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

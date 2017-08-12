package com.wdm.model;

import com.wdm.model.component.Basket;
import com.wdm.model.component.Frame;
import com.wdm.model.component.Handle;
import com.wdm.model.component.Wheel;

/*
 * @author wdmyong 2017/07/26
 */
public abstract class Bike {

    private long number;
    private Wheel wheel;
    private Frame frame;
    private Handle handle;
    private Basket basket;
    private Color color;
    private String word;

    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public Wheel getWheel() {
        return wheel;
    }
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public Frame getFrame() {
        return frame;
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    public Handle getHandle() {
        return handle;
    }
    public void setHandle(Handle handle) {
        this.handle = handle;
    }
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    @Override
    public String toString() {
        return "Bike \n{number:" + number + ", \nwheel:"
                + wheel + ", \nframe:" + frame + ", \nhandle:"
                + handle + ", \nbasket:" + basket + ", \ncolor:"
                + color + ", \nword:" + word + "}\n\n";
    }

}

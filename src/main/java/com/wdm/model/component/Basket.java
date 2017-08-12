package com.wdm.model.component;

import com.wdm.model.Color;

/*
 * @author wdmyong 2017/07/26
 * 车篓抽象类
 */
public abstract class Basket {

    private String name;
    private Color color;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Basket [name=" + name + ", color=" + color.getWord() + "]";
    }

    
}

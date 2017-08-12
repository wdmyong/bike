package com.wdm.model.component;

/*
 * @author wdmyong 2017/07/26
 * 方向盘抽象类
 */
public class Handle {

    private int angle;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Handle [angle=" + angle + "]";
    }
}

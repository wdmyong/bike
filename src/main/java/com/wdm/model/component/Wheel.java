package com.wdm.model.component;

/*
 * @author wdmyong 2017/07/26
 * 车轮抽象类
 */
public abstract class Wheel {

    private int rediu;
    private boolean gas;

    public int getRediu() {
        return rediu;
    }
    public void setRediu(int rediu) {
        this.rediu = rediu;
    }
    public boolean isGas() {
        return gas;
    }
    public void setGas(boolean gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Wheel [rediu=" + rediu + ", gas=" + gas + "]";
    }
}

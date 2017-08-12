package com.wdm.factory;

import java.util.concurrent.atomic.AtomicLong;

import com.wdm.model.Bike;
import com.wdm.model.Color;

/*
 * @author wdmyong 2017/07/26
 */
public abstract class BikeFatory {

    protected static final AtomicLong ATOMIC_LONG = new AtomicLong();

    Bike bike;

    public Bike orderBike() {
        bike = createBike();
        addColor();
        addWord();
        return bike;
    }

    abstract protected Bike createBike();

    protected void addColor() {
        bike.setColor(Color.DEFAULT);
    }
    protected void addWord() {
        bike.setWord("default");
    }
}

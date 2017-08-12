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
        createBike();
        addColor();
        addWord();
        return bike;
    }

    abstract protected void createBike();

    protected void processBike(BikeComponentFactory bikeComponentFactory) {
        bike.setNumber(ATOMIC_LONG.incrementAndGet());
        bike.setWheel(bikeComponentFactory.createWheel());
        bike.setFrame(bikeComponentFactory.createFrame());
        bike.setHandle(bikeComponentFactory.createHandle());
        bike.setBasket(bikeComponentFactory.createBasket());
    }
    protected void addColor() {
        bike.setColor(Color.DEFAULT);
    }
    protected void addWord() {
        bike.setWord("default");
    }
}

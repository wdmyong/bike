package com.wdm.Factory;

import com.wdm.model.Bike;
import com.wdm.model.HunanBike;

public class HubeiBikeFactory extends BikeFatory {

    private BikeComponentFactory bikeComponentFactory;

    public HubeiBikeFactory(BikeComponentFactory factory) {
        bikeComponentFactory = factory;
    }

    @Override
    protected Bike createBike() {
        Bike bike = new HunanBike();
        bike.setNumber(ATOMIC_LONG.incrementAndGet());
        bike.setWheel(bikeComponentFactory.createWheel());
        bike.setFrame(bikeComponentFactory.createFrame());
        bike.setHandle(bikeComponentFactory.createHandle());
        bike.setBasket(bikeComponentFactory.createBasket());
        return bike;
    }

    @Override
    protected void addWord() {
        bike.setWord("hubei bike");
    }
}

package com.wdm.factory;

import com.wdm.model.Bike;
import com.wdm.model.HunanBike;

public class HubeiBikeFactory extends BikeFatory {

    private BikeComponentFactory bikeComponentFactory;

    public HubeiBikeFactory(BikeComponentFactory factory) {
        bikeComponentFactory = factory;
    }

    @Override
    protected void createBike() {
        bike = new HunanBike();
        processBike(bikeComponentFactory);
    }

    @Override
    protected void addWord() {
        bike.setWord("hubei bike");
    }
}

package com.wdm.factory;

import com.wdm.model.Bike;
import com.wdm.model.HunanBike;

public class HunanBikeFactory extends BikeFatory {

    private BikeComponentFactory bikeComponentFactory;

    public HunanBikeFactory(BikeComponentFactory factory) {
        bikeComponentFactory = factory;
    }

    @Override
    protected void createBike() {
        bike = new HunanBike();
        processBike(bikeComponentFactory);
    }

    @Override
    protected void addWord() {
        bike.setWord("hunan bike");
    }

}

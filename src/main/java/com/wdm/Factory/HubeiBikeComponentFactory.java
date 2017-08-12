package com.wdm.Factory;

import com.wdm.model.component.Basket;
import com.wdm.model.component.DefaultBasket;
import com.wdm.model.component.Frame;
import com.wdm.model.component.Handle;
import com.wdm.model.component.HighFrame;
import com.wdm.model.component.SmallGasWheel;
import com.wdm.model.component.StraightHandle;
import com.wdm.model.component.Wheel;

public class HubeiBikeComponentFactory extends BikeComponentFactory {

    @Override
    protected Wheel createWheel() {
        return new SmallGasWheel();
    }

    @Override
    protected Frame createFrame() {
        return new HighFrame();
    }

    @Override
    protected Handle createHandle() {
        return new StraightHandle();
    }

    @Override
    protected Basket createBasket() {
        return new DefaultBasket();
    }

}

package com.wdm.Factory;

import com.wdm.model.component.Basket;
import com.wdm.model.component.BlackBasket;
import com.wdm.model.component.DefaultFrame;
import com.wdm.model.component.Frame;
import com.wdm.model.component.Handle;
import com.wdm.model.component.LargeWheel;
import com.wdm.model.component.RightHandle;
import com.wdm.model.component.Wheel;

public class HunanBikeComponentFactory extends BikeComponentFactory {

    @Override
    protected Wheel createWheel() {
        return new LargeWheel();
    }

    @Override
    protected Frame createFrame() {
        return new DefaultFrame();
    }

    @Override
    protected Handle createHandle() {
        return new RightHandle();
    }

    @Override
    protected Basket createBasket() {
        return new BlackBasket();
    }

}

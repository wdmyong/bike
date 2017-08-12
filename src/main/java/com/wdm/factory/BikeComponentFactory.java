package com.wdm.factory;

import com.wdm.model.component.Basket;
import com.wdm.model.component.Frame;
import com.wdm.model.component.Handle;
import com.wdm.model.component.Wheel;

/*
 * @author wdmyong 2017/07/26
 */
public abstract class BikeComponentFactory {

    abstract protected Wheel createWheel();

    abstract protected Frame createFrame();

    abstract protected Handle createHandle();

    abstract protected Basket createBasket();
}

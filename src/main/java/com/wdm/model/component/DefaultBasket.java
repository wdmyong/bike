package com.wdm.model.component;

import com.wdm.model.Color;

public class DefaultBasket extends Basket {

    public DefaultBasket() {
        setColor(Color.DEFAULT);
        setName(Color.DEFAULT.getWord());
    }
}

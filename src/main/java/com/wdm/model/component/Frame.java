package com.wdm.model.component;

import com.wdm.model.Level;

/*
 * @author wdmyong 2017/07/26
 * 车架抽象类
 */
public abstract class Frame {

    private Level level;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Frame [level=" + level.getName() + "]";
    }
}

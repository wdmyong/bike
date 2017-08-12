package com.wdm;

import com.wdm.factory.HubeiBikeComponentFactory;
import com.wdm.factory.HubeiBikeFactory;
import com.wdm.factory.HunanBikeComponentFactory;
import com.wdm.factory.HunanBikeFactory;

/*
 * @author wdmyong 2017/07/26
 */
public class MainApplication {

    public static void main(String[] args) {
        System.out.println(new HunanBikeFactory(
                new HunanBikeComponentFactory()).orderBike());
        
        System.out.println(new HubeiBikeFactory(
                new HubeiBikeComponentFactory()).orderBike());
    }
}

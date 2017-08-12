package com.wdm;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wdm.Factory.HubeiBikeComponentFactory;
import com.wdm.Factory.HubeiBikeFactory;
import com.wdm.Factory.HunanBikeComponentFactory;
import com.wdm.Factory.HunanBikeFactory;

/*
 * @author wdmyong 2017/07/26
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.out.println(new HunanBikeFactory(
                new HunanBikeComponentFactory()).orderBike());
        
        System.out.println(new HubeiBikeFactory(
                new HubeiBikeComponentFactory()).orderBike());
    }
}

package com.wdm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.wdm.factory.HubeiBikeComponentFactory;
import com.wdm.factory.HubeiBikeFactory;
import com.wdm.factory.HunanBikeComponentFactory;
import com.wdm.factory.HunanBikeFactory;
import com.wdm.model.Bike;

/*
 * @author wdmyong 2017/07/26
 */
public class MainApplication {

    public static void main(String[] args) {

        List<Bike> bikeList = new ArrayList<>();

        bikeList.add(new HunanBikeFactory(new HunanBikeComponentFactory()).orderBike());
        bikeList.add(new HubeiBikeFactory(new HubeiBikeComponentFactory()).orderBike());

        bikeList.forEach(System.out::println);

        bikeList.stream().map(bike -> "my number is:\t" + bike.getNumber())
            .collect(Collectors.toList())    // 这一步就是加着玩的
            .forEach(System.out::println);
    }
}

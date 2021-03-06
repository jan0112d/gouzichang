package com.designpatterns.duck.fly.impl;

import com.designpatterns.duck.fly.FlyBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class FlyWithWings implements FlyBehavior {
    /**
     * 飞行
     */
    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}

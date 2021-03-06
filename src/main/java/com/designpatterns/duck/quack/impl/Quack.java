package com.designpatterns.duck.quack.impl;

import com.designpatterns.duck.quack.QuackBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class Quack implements QuackBehavior {

    /**
     * 鸭子呱呱叫
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

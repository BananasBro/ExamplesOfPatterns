package com.design.decorator;

public class TestDecorator {

    public static void main(String args[]) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new BasicIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}

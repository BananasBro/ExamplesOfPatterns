package com.design.decorator;

public record BasicIcecream() implements Icecream {
    @Override
    public String makeIcecream() {
        return null;
    }
}

package com.ybh.designpattern.strategy;

public class CateStrategy implements AnimalStrategy {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

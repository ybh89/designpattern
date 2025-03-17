package com.ybh.designpattern.strategy;

public class DogStrategy implements AnimalStrategy {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

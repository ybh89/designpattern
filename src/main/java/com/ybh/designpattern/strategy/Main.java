package com.ybh.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnimalStrategy(new DogStrategy());
        animal.makeSound();

        animal.setAnimalStrategy(new CateStrategy());
        animal.makeSound();
    }
}

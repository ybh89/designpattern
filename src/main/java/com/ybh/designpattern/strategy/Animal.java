package com.ybh.designpattern.strategy;

public class Animal {
    private AnimalStrategy animalStrategy;

    public void setAnimalStrategy(AnimalStrategy animalStrategy) {
        this.animalStrategy = animalStrategy;
    }

    public void makeSound() {
        if (animalStrategy == null) {
            return;
        }

        animalStrategy.makeSound();
    }
}

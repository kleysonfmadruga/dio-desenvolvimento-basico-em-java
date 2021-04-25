package com.iridium.inheritanceAndPolymorphism;

public class Dog implements Quadruped{
    // But non-default methods must be implemented
    @Override
    public void walkingOnFourLags() {
        System.out.println("The dog is walking on four lags");
    }

    // We can override default methods of an interface
    @Override
    public void saySpecie(){
        System.out.println("I'm a dog");
    }
}

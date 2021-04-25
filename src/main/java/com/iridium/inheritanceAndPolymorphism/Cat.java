package com.iridium.inheritanceAndPolymorphism;

public class Cat extends Feline implements Quadruped{
    // This is an implementation of the method in the Quadruped interface
    @Override
    public void walkingOnFourLags() {
        System.out.println("The cat is walking on four lags");
    }

    // This is an implementation of the abstract method in the Feline class
    @Override
    public void eat() {
        System.out.println("The cat is eating a rat");
    }

    public void iAmTheCat(){
        System.out.println("Hi, I'm THE Cat");
    }
}

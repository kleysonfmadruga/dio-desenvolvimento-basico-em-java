package com.iridium.inheritanceAndPolymorphism;

public class Main {
    public static void main(String[] args){
        Cat catOne = new Cat();
        Lynx lynxOne = new Lynx();

        // Abstract classes can be instantiated through its concrete classes
        Feline catTwo = new Cat();
        Feline lynxTwo = new Lynx();

        // Interfaces also can be instantiated through its implementations
        Quadruped catThree = new Cat();
        Quadruped cowOne = new Cow();

        // Lynx class don't implements the Quadruped interface, so the code below won't work
        //Quadruped lynxThree = new Lynx();

        // Abstract classes can't be instantiated through 'new' operator
        //Feline feline = new Feline();

        // In catOne, we can access all the methods defined of Cat and Feline classes and Quadruped interface
        catOne.iAmTheCat();
        // In catTwo, we can only access the methods defined in Feline
        catTwo.eat();
        // In catThree, we can only access the methods defined in Quadruped
        catThree.walkingOnFourLags();

        lynxOne.eat();
        lynxTwo.eat();

        cowOne.walkingOnFourLags();
        cowOne.saySpecie();
    }
}

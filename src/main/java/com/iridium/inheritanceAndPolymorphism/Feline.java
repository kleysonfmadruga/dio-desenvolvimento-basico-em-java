package com.iridium.inheritanceAndPolymorphism;

public abstract class Feline {
    // Abstract methods don't have a body
    public abstract void eat();

    // Abstract classes can have concrete methods
    // but concrete classes can't have abstract methods
    public void shakeTail(){
        System.out.println("Shaking the tail");
    }

    // Methods can have the same name as long as it has a different signature
    // This is called 'method overloading'
    // The signature of a method is defined by its return type, parameters, visibility and exceptions that it throws
    public void shakeTail(String times){
        System.out.printf("Shaking the tail %s times\n", times);
    }

    // Final methods can't be overridden by child classes
    public final void dontOverrideMe(){
        System.out.println("Don't override me, I'm final");
    }
}

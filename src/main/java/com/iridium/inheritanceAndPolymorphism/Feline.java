package com.iridium.inheritanceAndPolymorphism;

public abstract class Feline {
    // Abstract methods don't have a body
    public abstract void eat();

    // Abstract classes can have concrete methods
    // but concrete classes can't have abstract methods
    public void shakeTail(){
        System.out.println("Shaking the tail");
    }

    // Final methods can't be overridden by child classes
    public final void dontOverrideMe(){
        System.out.println("Don't override me, I'm final");
    }
}

package com.iridium.inheritanceAndPolymorphism;

public class Lynx extends Feline{
    // Abstract methods must be implemented in concrete classes
    @Override
    public void eat() {
        System.out.println("The lynx is eating a snake");
    }

    // We can't override a final method
    //public void dontOverrideMe(){}
}

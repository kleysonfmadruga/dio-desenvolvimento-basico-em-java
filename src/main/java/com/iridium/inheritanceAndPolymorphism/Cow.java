package com.iridium.inheritanceAndPolymorphism;

public final class Cow implements Quadruped{
    public void sayMoo(){
        System.out.println("The cow says mooo");
    }

    @Override
    public void walkingOnFourLags() {
        System.out.println("The cow is walking on four lags");
    }

    @Override
    public void saySpecie() {
        System.out.println("I'm a Cooow");
    }
}

// The MyNewCow class can't extend the Cow class, because the Cow class is final
//class MyNewCow extends Cow {}
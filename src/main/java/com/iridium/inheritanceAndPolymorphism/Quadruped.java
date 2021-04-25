package com.iridium.inheritanceAndPolymorphism;

public interface Quadruped {
    // Attributes can also be defined in interfaces
    final String SPECIE = "I'm a quadruped animal";

    // This method must be implemented by whoever implements this interface
    void walkingOnFourLags();

    // Default methods in interface have body, it's a way of not breaking old implementations of the interface
    // and allowing it to evolve
    default void saySpecie(){
        System.out.println(SPECIE);
    }
}

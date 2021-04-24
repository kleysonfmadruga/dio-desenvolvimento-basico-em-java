package com.iridium.accessModifiers.packageTwo;

import com.iridium.accessModifiers.packageOne.Dog;

public class Main {
    public static void main(String[] args){
        Dog toby = new Dog();

        toby.name = "Toby";
        toby.setAge(2);

        // This line causes an error, because the 'owner' attribute is protected
        // and only can be accessed inside of the package 'packageOne'
        //toby.owner = "Joe";

        System.out.println("The dog name is: " + toby.name);
        //System.out.println("Its owner is: " + toby.owner);
        System.out.println("It's: " + toby.getAge() + " years old");
    }
}

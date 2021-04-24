package com.iridium.accessModifiers.packageOne;

public class Main {
    public static void main(String[] args){
        Dog toby = new Dog();

        toby.name = "Toby";
        toby.owner = "Joe";

        // The code below cause an error, because the 'age' attribute is private
        // and can't be accessed outside of the class
        // To set the value 2 in the age attribute, we must use its setter
        //toby.age = 2;
        toby.setAge(2);

        System.out.println("The dog name is: " + toby.name);
        System.out.println("Its owner is: " + toby.owner);
        System.out.println("It's: " + toby.getAge() + " years old");
    }
}

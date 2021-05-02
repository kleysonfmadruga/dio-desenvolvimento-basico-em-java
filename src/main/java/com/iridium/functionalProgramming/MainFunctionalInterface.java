package com.iridium.functionalProgramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainFunctionalInterface {
    public static void main(String[] args){
        Calc calcSum = (a, b) -> a + b;
        Calc calcSub = (a, b) -> a - b;

        System.out.println(myHighOrderFunction(calcSum, 2d, 5d));
        System.out.println(myHighOrderFunction(calcSub, 2d, 5d));

        // Consumers are functional interfaces that receives a parameter and don't returns anything
        Consumer<String> print = sentence -> System.out.println("Printing the word: \"" + sentence + "\"");
        // To execute the code of a consumer, we must call the accept method of the interface
        print.accept("Hi, my name is Kleyson");

        // Functions are functional interfaces that receives a parameter and returns a value
        // The first generic type is the parameter's type and the second generic type is the return's type
        Function<Integer, String> toString = number -> String.valueOf(number);
        System.out.println(toString.apply(294).isEmpty());

        // Predicates are functional interfaces that receives a parameter and returns a boolean
        // It's often used in filters of collection streams
        Predicate<String> haveMoreThanTenChars = (sentence) -> sentence.length() > 10;
        System.out.println(haveMoreThanTenChars.test("Balacobacos"));

        // Suppliers are functional interfaces that doesn't receives any parameter and returns a value
        // The generic type is the return's type
        Supplier<Person> generatePerson = () -> new Person("Joe", 43);
        System.out.println(generatePerson.get());

    }

    // High order functions are functions (in this case, a method) that receives other function as a parameter
    // or that returns a function
    public static double myHighOrderFunction(Calc calc, double a, double b){
        return calc.operation(a, b);
    }
}

@FunctionalInterface
interface Calc{
    Double operation(Double a, Double b);
}

class Person extends Object{
    private String name;
    private Integer age;

    public Person(final String name, final Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " tem " + age + " anos de idade";
    }
}
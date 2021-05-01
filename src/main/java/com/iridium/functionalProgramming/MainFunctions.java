package com.iridium.functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.lang.FunctionalInterface;

public class MainFunctions {
    public static void main(String[] args){
        /*
            In the functional paradigm, the value of the variables can't be changed by any function
            Only through reassignment
        */
        // The BiPredicate interface is an functional interface
        BiPredicate<Integer, Integer> firstGreaterThanSecond = (first, second) -> first > second;
        UnaryOperator<Double> divideByTen = (number) -> number / 10;

        // The body of the function can be replaced by a method reference in some cases
        Function<Integer, Double> squareRootOf = Math::sqrt;

        // To execute the defined function, the method to call changes according with the interface
        System.out.println(firstGreaterThanSecond.test(10, 2));
        System.out.println(divideByTen.apply(35d));
        System.out.println(squareRootOf.apply(2));

        /*
            - If the lambda have just one parameter, the parentheses aren't necessary
            - If the lambda have just one line of implementation, the curly braces and
                the 'return' keyword aren't necessary
        */
        MyFunctionalInterface fin = number -> number * 2;
        System.out.println(fin.calculate(2));
        System.out.println(fin.calculateDouble(2d));
    }
}

// Declaring a functional interface in Java
@FunctionalInterface
interface MyFunctionalInterface{
    Integer calculate(Integer number);
    // The functional interface doesn't allow two abstract methods inside it
    //Double calculateDouble(Double number);

    // If the method is default, we can define more than one method in the functional interface
    default Double calculateDouble(Double number){
        return number * 2;
    }
}

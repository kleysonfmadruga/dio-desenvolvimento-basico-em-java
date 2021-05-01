package com.iridium.functionalProgramming;

public class MainRecursion {
    public static void main(String[] args){
        System.out.println("Factorial of 10: " + factorial(10));
        System.out.println("Factorial of 10: " + factorialWithTailCall(10, 1));
    }

    // A recursive function is a function that calls itself internally
    // All recursive functions must have a stop point
    public static int factorial(final int number){
        System.out.println("Call of factorial method");
        // Stop point of this function
        if (number == 1){
            return number;
        }
        return number * factorial(number - 1);
    }

    public static int factorialWithTailCall(final int number, final int previousResult){
        System.out.println("Call of factorial with tail call method");
        // Stop point of this function
        if (number == 1){
            return previousResult;
        }

        return factorialWithTailCall(number - 1, previousResult * number);
    }
}

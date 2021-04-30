package com.iridium.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args){
        /*
            The Stream API allows you to handle with collections using the functional paradigm
            The functions don't changes the value of the collection
            The collection isn't modified, these methods don't modifies the values
            Functions of API:
                - mapping: modifies each element and returns the changed collection;
                - filtering: filters certain elements according to the defined rules;
                - forEach: behaves the same as the for-each loop;
                - peek: executes a series of commands to each element, returning the same collection;
                - counting: returns the number of elements;
                - grouping: groups the elements according to the defined rules
        */

        List<Integer> primes = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37));

        System.out.println("There are " + primes.stream().count() + " primes in the collection");

        // For-each method receives a consumer and doesn't returns a stream, so you can't operate here anymore
        primes.stream().forEach((value) -> {
            System.out.println(value + " x 2 = " + value * 2);
        });

        var minValue = primes.stream().min(Comparator.comparingInt(Integer::intValue));
        minValue.ifPresent(System.out::println);

        // If the expression of the filter is true, the value goes to the result of the filtering
        // The peek method returns a stream, so you can continue to operate here
        // The collect method collects all the elements of the stream and turns it to a collection
        var higherThanTwenty = primes.stream()
                                                .filter((value) -> value > 20)
                                                .peek((value) -> System.out.println(value + " is higher than 20")).collect(Collectors.toList());


        System.out.println(higherThanTwenty);

        // The limit method limits the collection to the n first elements
        var firstFivePrimes = primes.stream().limit(5).collect(Collectors.toList());

        System.out.println(firstFivePrimes);

        // If all elements return true in the rule, the method will return true
        // If any element return false, the method will return false
        var areAllGreaterThanZero = primes.stream().allMatch((value) -> value > 0);
        System.out.println("Are all numbers greater than zero? " + areAllGreaterThanZero);

        // If any element return true in the rule, the method will return true
        // If no elements return false, the method will return false
        var areAnyGreaterThanTwenty = primes.stream().anyMatch((value) -> value > 20);
        System.out.println("Are any numbers greater than zero? " + areAnyGreaterThanTwenty);

        // If any elements return true in the rule, the method will return false
        // If all element return false, the method will return true
        var areNoneGreaterThanTen = primes.stream().noneMatch((value) -> value > 10);
        System.out.println("Are none numbers greater than 10? " + areNoneGreaterThanTen);

        primes.stream().findFirst().ifPresent((value) -> System.out.println("The first prime is " + value));
    }
}

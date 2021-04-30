package com.iridium.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args){
        /*
            - Comparators allows to the programmer to define a rule to order complex objects
                and must be implemented outside of the entities to compare
            - Comparables must be implemented in the entities to compare
        */

        List<Integer> numbers = new ArrayList<>(List.of(1, 5, 12, 63, 34, 57, 42, 6, 5, 87, 36, 23));

        // The sort method receives a Comparator instance as a parameter
        // This is the lambda syntax. It can be used when the method receives a functional interface
        // Functional interfaces are interfaces that have just one method defined
        numbers.sort(
            (first, second) -> {
                return first - second;
            }
        );
        System.out.println(numbers);

        // A list also can be ordered by a key (attribute or method) of the class T of the List
        numbers.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(numbers);

        // Lists can be ordered by the sort method of Collections class
        Collections.sort(numbers);
        System.out.println(numbers);

        // Lists also can be ordered by a customized comparator
        //Collections.sort(numbers, new NumberComparator());
        numbers.sort(new NumberComparator());
        System.out.println(numbers);

    }
}

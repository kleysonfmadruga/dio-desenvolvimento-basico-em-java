package com.iridium.collections;

import java.util.*;

public class MainList {
    public static void main(String[] args){
        /*
            - Lists allows you to work with elements in the same way as static arrays, but dynamically
            - Lists allows you to add, update, remove and sort the elements
        */

        // Collection is the basic interface of the Collections API of Java
        // Inherits from him List, Queue, Set and Map
        List<Integer> primes = new ArrayList<>(List.of(3, 2, 5, 11, 17, 13, 7, 29, 23, 18, 30));
        primes.remove(10);
        primes.add(31);
        primes.set(9, 19);
        System.out.println("4th element of primes list is " + primes.get(4));
        System.out.println("Unsorted primes: " + primes);

        // The Collections class is an utility class to operate or return collections in Java
        Collections.sort(primes);
        System.out.printf("There are %d prime numbers\n", primes.size());
        System.out.println("Is the number 5 in the list? " + primes.contains(5));
        System.out.println("Is the list empty? " + primes.isEmpty());
        System.out.println("Sorted primes: " + primes);

        System.out.println("Multiplying all primes by 2");
        for (var prime : primes){
            System.out.println(prime + " x 2 = " + prime * 2);
        }

        System.out.println("Dividing all primes by 3");
        Iterator<Integer> iterator = primes.iterator();

        while (iterator.hasNext()){
            var prime = iterator.next();
            System.out.println(prime + " / 3 = " + prime / 3f);
        }

    }
}

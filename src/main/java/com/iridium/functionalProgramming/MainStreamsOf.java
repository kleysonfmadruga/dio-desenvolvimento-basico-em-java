package com.iridium.functionalProgramming;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreamsOf {
    public static void main(String... args){
        String[] names = {"José", "Maria", "Adelson", "Márcio", "Fátima"};

        // The Stream class can be used to operate with the Stream API
        var persons = Stream.of(names).filter(name -> name.length() > 3)
                .peek(name -> System.out.println("This is " + name))
                .map(name -> name + " Madruga")
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.joining(", "));

        System.out.println(persons);
    }
}

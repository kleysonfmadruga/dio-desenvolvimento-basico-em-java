package com.iridium.collections;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args){
        Optional<String> optionalString = Optional.of("The value of optional exists");
        Optional<String> optionalEmpty = Optional.empty();
        // To pass a null to the Optional, we must use the ofNullable method
        Optional<String> optionalNull = Optional.ofNullable(null);

        optionalString.ifPresentOrElse(
                System.out::println, // If the optional isn't null, this method will be executed (must be a consumer)
                () -> System.out.println("The value of the optional doesn't exists")
                // If the optional is null, the functional interface above will be executed
        );

        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("The value of the optional doesn't exists"));

        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("The value of the optional is null"));

        if (optionalString.isPresent()){
            System.out.println("The value of the optional is present");
            System.out.println("The value is: '" + optionalString.get() + "'");
        }

        if (optionalEmpty.isEmpty()){
            System.out.println("The value of the optional is empty");
        }

        // If we pass a null in the of method, a NullPointerException will be thrown
        try {
            Optional<String> optionalNullException = Optional.of(null);
        } catch (NullPointerException ex){
            System.out.println("The optionalNullException is null");
        }

        // If the value isn't present, the method orElseThrow throws an Exception
        try {
            optionalEmpty.orElseThrow(NullPointerException::new);
        } catch (NullPointerException e){
            System.out.println("The ofElseThrow has thrown an exception");
        }

        // The value of the optional can be processed by the map method
        optionalString.map((value) -> value.concat(" and it was concatenated")).ifPresent(System.out::println);
    }
}

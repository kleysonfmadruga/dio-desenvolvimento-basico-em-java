package com.iridium.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args){
        /*
            - Sets don't allows you to order the list (TreeSet do)
            - Sets don't allows you to insert a same element twice
            - Sets don't ensures order (LinkedHashSet and TreeSet do)
            - Sets allow you to operate with unions and intersections

            Performance scale: fastest -------------------------- slowest
                               HashSet   --  LinkedHashSet   --   TreeSet
        */

        HashSet<Double> naturalNumbers = new HashSet<>();
        HashSet<Double> integerNumbers = new HashSet<>();
        HashSet<Double> rationalNumbers = new HashSet<>();
        HashSet<Double> irrationalNumbers = new HashSet<>();
        HashSet<Double> realNumbers = new HashSet<>();

        naturalNumbers.add(0d);
        naturalNumbers.add(1d);
        naturalNumbers.add(2d);
        naturalNumbers.add(3d);

        integerNumbers.addAll(naturalNumbers);
        System.out.println("Integer numbers set adding natural numbers: " + integerNumbers);
        // This 0 will not be repeated in the set
        integerNumbers.add(0d);
        integerNumbers.add(-1d);
        integerNumbers.add(-2d);
        integerNumbers.add(-3d);
        System.out.println("Integer numbers set adding integer numbers: " + integerNumbers);

        rationalNumbers.addAll(integerNumbers);
        rationalNumbers.add(1.5d);
        rationalNumbers.add(2.5d);
        rationalNumbers.add(3.5d);
        rationalNumbers.add(-1.5d);
        rationalNumbers.add(-2.5d);
        rationalNumbers.add(-3.5d);

        irrationalNumbers.add(3.14);
        irrationalNumbers.add(1.41421);
        irrationalNumbers.add(1.73205);

        realNumbers.addAll(rationalNumbers);
        realNumbers.addAll(irrationalNumbers);

        // The retainAll method do an intersection operation
        HashSet<Double> intersectionIntegerRational = new HashSet<>(rationalNumbers);
        intersectionIntegerRational.retainAll(integerNumbers);

        HashSet<Double> intersectionRationalIrrational = new HashSet<>(irrationalNumbers);
        intersectionRationalIrrational.retainAll(rationalNumbers);

        System.out.println("Intersection of Z and R sets: " + intersectionIntegerRational);
        System.out.println("Intersection of R and I sets: " + intersectionRationalIrrational);

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Maçã");
        fruits.add("Pera");
        fruits.add("Uva");
        fruits.add("Banana");

        System.out.println("\nThe LinkedHashSet maintain the order of insertion: " + fruits);

        TreeSet<String> cities = new TreeSet<>();

        // Every insertion makes the TreeSet recalculate the ordination of the elements
        cities.add("João Pessoa");
        cities.add("Recife");
        cities.add("Natal");
        cities.add("Fortaleza");
        cities.add("Salvador");
        cities.add("Goiania");
        cities.add("Maceió");
        cities.add("Aracajú");
        cities.add("Porto Alegre");
        cities.add("Florianópolis");
        cities.add("Curitiba");
        cities.add("São Paulo");
        cities.add("Rio de Janeiro");
        cities.add("Cuiabá");
        cities.add("Rio Branco");
        cities.add("Manaus");
        cities.add("Belém");
        cities.add("Campo Grande");

        System.out.println(cities);

        // Returns the node above or below
        System.out.println("João Pessoa está abaixo de: " + cities.lower("João Pessoa"));
        System.out.println("João Pessoa está acima de: " + cities.higher("João Pessoa"));

        // Return the top or the bottom of the TreeSet
        System.out.println(cities.first());
        System.out.println(cities.last());

        // Return the top or the bottom of the TreeSet and remove it
        System.out.println(cities.pollFirst());
        System.out.println(cities.pollLast());

        System.out.println(cities);
    }
}

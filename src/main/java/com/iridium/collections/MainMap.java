package com.iridium.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args){
        /*
            - Maps are key-value data structures
            - They allows you to insert repeated values, but don't allows you to insert repeated keys
            - Can be ordered
            - Allows search by keys and values, update values and navigation
        */

        // Don't maintain the order of insertion
        HashMap<Integer, String> persons = new HashMap<>();

        // Add a new key-value pair
        persons.put(0, "José");
        persons.put(1, "Maria");
        persons.put(2, "Lucas");
        persons.put(3, "Ana");

        // Get the value by the key
        // If the key doesn't exists, the get method returns null
        System.out.println("Pessoa relacionada à chave '3': " + persons.get(3));

        // If the key already exists, the value of the pair is updated
        persons.put(3, "Ana Beatriz");

        // Verify if the map contains the key
        System.out.println("A chave '3' existe? " + persons.containsKey(3));

        // Verify if the map contains the value
        System.out.println("O valor 'Lucas' existe? " + persons.containsValue("Lucas"));

        System.out.println(persons);
        System.out.println("There are all the keys: " + persons.keySet());

        // To navigate in a HashMap, we can use the entrySet method to return an iterator
        for (Map.Entry<Integer, String> person : persons.entrySet()){
            System.out.println(person.getValue());
        }

        /* ------------------------------------------------------------------------------------ */

        TreeMap<String, String> capitals = new TreeMap<>();

        capitals.put("BRA", "Brasilia");
        capitals.put("EUA", "New York");
        capitals.put("FRA", "Paris");
        capitals.put("ITA", "Roma");
        capitals.put("ESP", "Madrid");
        capitals.put("POR", "Lisboa");
        capitals.put("ALE", "Berlin");

        System.out.println(capitals);

        // Returns the first and the last entry of the TreeMap
        System.out.println("Primeiro par do TreeMap: " + capitals.firstEntry());
        System.out.println("Último par do TreeMap: " + capitals.lastEntry());

        // Returns the entry above or below the entry that posses the key
        System.out.println("Brasil acima de: " + capitals.higherEntry("BRA"));
        System.out.println("Brasil abaixo de: " + capitals.lowerEntry("BRA"));
    }
}

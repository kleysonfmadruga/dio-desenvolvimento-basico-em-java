package com.iridium.collections;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args){
        /*
            - Queues don't allow you to change the order of its elements
            - Queues don't allow you to update an elements within the list
            - Queues allows you to put new elements at the end of the list
            - Queues allows you to remove elements of the start of the list
        */
        Queue<String> patients = new LinkedList<>();

        patients.add("José");
        patients.add("Márcia");
        patients.add("João");
        patients.add("Maria");
        patients.add("Lucas");
        patients.add("Ana");

        System.out.printf("There are %d patients: %s\n", patients.size(), patients);

        // queue.poll -> remove the head of the queue and return it
        // If the queue is empty, this method returns null
        System.out.printf("The patient %s was attended\n", patients.poll());

        // queue.peek -> return the head of the queue without removing it
        // If the queue is empty, this method returns null
        System.out.printf("- Who is the next patient to be attended?\n- The patient is %s\n", patients.peek());

        // queue.element -> return the head of the queue without removing it
        // If the queue is empty, this method throws a NoSuchElementException
        System.out.printf("- Sorry?\n- The patient is %s\n", patients.element());

        System.out.printf("The following %d patients weren't attended", patients.size());
        for (var patient : patients){
            System.out.println(patient);
        }



    }
}

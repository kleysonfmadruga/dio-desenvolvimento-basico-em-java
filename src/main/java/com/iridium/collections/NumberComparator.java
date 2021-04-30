package com.iridium.collections;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {
    // The compare method must return an integer number
    // If it returns a positive number, the left side of the expression will be put in the right in the list
    // If it returns zero, the order of insertion will be maintained
    // If it returns a negative number, the left side of the expression will be put in the left in the list
    @Override
    public int compare(Integer first, Integer second) {
        return second - first;
    }
}

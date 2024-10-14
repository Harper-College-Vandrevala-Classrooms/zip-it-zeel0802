package com.csc;

import java.util.ArrayList;
import java.util.List;

public class Zipper {

    // Generic method to zip two lists together
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int i = 0;

        // Interleave elements from both lists
        while (i < size1 && i < size2) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

        // Add remaining elements from list1 if any
        while (i < size1) {
            result.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2 if any
        while (i < size2) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }
}

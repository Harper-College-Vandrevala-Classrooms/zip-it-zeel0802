package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZipperTest {

    @Test
    public void testZipEqualSizeLists() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, Zipper.zip(list1, list2));
    }

    @Test
    public void testZipFirstListLonger() {
        List<String> list1 = List.of("Red", "Green", "Blue");
        List<String> list2 = List.of("White");
        List<String> expected = List.of("Red", "White", "Green", "Blue");
        assertEquals(expected, Zipper.zip(list1, list2));
    }

    @Test
    public void testZipSecondListLonger() {
        List<String> list1 = List.of("Red");
        List<String> list2 = List.of("White", "Black", "Orange");
        List<String> expected = List.of("Red", "White", "Black", "Orange");
        assertEquals(expected, Zipper.zip(list1, list2));
    }

    @Test
    public void testZipEmptyLists() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, Zipper.zip(list1, list2));
    }
}

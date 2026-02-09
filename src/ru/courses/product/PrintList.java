package ru.courses.product;

import java.util.ArrayList;

public class PrintList {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(a -> System.out.println(a));
    }
}

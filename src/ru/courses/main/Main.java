package ru.courses.main;
import java.util.ArrayList;

import static ru.courses.product.PrintList.printList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(87);
        numbers.add(543);
        numbers.add(65);
        numbers.add(478);

        printList(numbers);
    }
}
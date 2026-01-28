package ru.courses.main;

import ru.courses.product.Sum;

public class Main {
    public static void main(String[] args) {
        double result = Sum.calculateSum(args);
        System.out.println(result);
    }
}
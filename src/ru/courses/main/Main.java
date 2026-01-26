package ru.courses.main;

import ru.courses.product.Sauce;

public class Main {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Бастако", Sauce.Spiciness.VERY_HOT);
        Sauce sauce2 = new Sauce("Юдзу", Sauce.Spiciness.HOT);
        Sauce sauce3 = new Sauce("Сырный", Sauce.Spiciness.MILD);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}
package ru.courses.main;

import ru.courses.product.*;

import java.util.ArrayList;
import java.util.Arrays;

import static ru.courses.product.Cat.resetFields;
//import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("До обнуления: " + cat);
        resetFields(cat);
        System.out.println("После обнуления: " + cat);

        Dog dog = new Dog("Reks", 4, "Labrador");
        System.out.println("До обнуления: " + dog);
        resetFields(dog);
        System.out.println("После обнуления: " + dog);
    }
}
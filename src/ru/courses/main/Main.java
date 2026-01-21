package ru.courses.main;

import ru.courses.geometry.Point;
//import java.awt.Point;


public class Main {

    public static void main(String[] args) {
        Point myPoint = new Point (7, 1);
        java.awt.Point awtPoint = new java.awt.Point(5, 2);

        System.out.println("ru.courses.geometry.Point is (" + myPoint);
        System.out.println("java.awt.Point is (" + awtPoint.x + ", " + awtPoint.y + ")");
    }
}
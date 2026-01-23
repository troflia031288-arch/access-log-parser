package ru.courses.main;

import ru.courses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 7);
        Point point2 = new Point(1, 7);
        Point point3 = new Point(2, 8);

        System.out.println("Точка point1 равна точке point2: " + point1.equals(point2));
        System.out.println("Точка point1 равна точке point3: " + point1.equals(point3));

        try {
            Point clonedPoint = (Point) point1.clone();
            System.out.println("Склонированная точка: (" + clonedPoint.x + ", " + clonedPoint.y + ")");
            System.out.println("Склонированная точка равна точке point1: " + clonedPoint.equals(point1));
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Хэш-код точки point1: " + point1.hashCode());
        System.out.println("Хэш-код точки point2: " + point2.hashCode());
        System.out.println("Хэш-код точки point3: " + point3.hashCode());
    }
}
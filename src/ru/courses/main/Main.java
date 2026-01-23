package ru.courses.main;

import ru.courses.geometry.Point;
import ru.courses.geometry.Line;
import ru.courses.geometry.PolyLine;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(4, 6);
        Point p2 = new Point(7, 2);
        Point p3 = new Point(1, 3);

        PolyLine polyline1 = new PolyLine(p1, p2, p3);
        PolyLine polyline2 = new PolyLine(p1, p2, p3);
        PolyLine polyline3 = new PolyLine(p1, p2);

        System.out.println("Равна ли ломаная polyline1 ломаной polyline2? " + polyline1.equals(polyline2));
        System.out.println("Равна ли ломаная polyline1 ломаной polyline3? " + polyline1.equals(polyline3));

        System.out.println("Хэш-код ломаной polyline1: " + polyline1.hashCode());
        System.out.println("Хэш-код ломаной polyline2: " + polyline2.hashCode());
        System.out.println("Хэш-код ломаной polyline3: " + polyline3.hashCode());

    }
}
package ru.courses.main;

import ru.courses.geometry.Point;
import ru.courses.geometry.Line;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(4, 6);
        Point p2 = new Point(7, 2);

        Line line1 = new Line(p1, p2);

        Line line2 = null;
        try {
            line2 = (Line) line1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 1 равна линии 2? " + line1.equals(line2));

        try {
            Point newEnd = new Point(8, 2);
            line2 = new Line(p1, newEnd);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
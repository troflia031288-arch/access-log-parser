package ru.courses.main;

import ru.courses.geometry.ClosedPolyLine;
import ru.courses.geometry.Line;
import ru.courses.geometry.PolyLine;
import ru.courses.geometry.Measurable;
import ru.courses.geometry.Point;


public class Main {
    public static void printLengths(Measurable[] measurables) {
        for (Measurable measurable : measurables) {
            System.out.println("Длина =  " + measurable.getLength());
        }
    }

    public static void main(String[] args) {
        // Создаем объекты
        Line line = new Line(new Point(1, 2), new Point(5, 6));
        PolyLine polyline = new PolyLine(new Point(1, 2), new Point(5, 6), new Point(10, 11));
        ClosedPolyLine closedPolyline = new ClosedPolyLine(new Point(0, 0), new Point(3, 4), new Point(6, 0));

        // Передаем их в метод printLengths
        Measurable[] shapes = {line, polyline, closedPolyline};
        printLengths(shapes);
    }
}
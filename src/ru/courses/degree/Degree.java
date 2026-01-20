package ru.courses.degree;

public class Degree {

    public static double CalculateDegree(String xStr, String yStr) {
        int xInt = Integer.parseInt(xStr);
        int yInt = Integer.parseInt(yStr);
        return Math.pow(xInt, yInt);
    }

}
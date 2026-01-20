package ru.courses.main;
import static ru.courses.degree.Degree.CalculateDegree;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Укажите в командной строке 2 числа!");
            return;
        }

    String x = args[0];
    String y = args[1];

    double result = CalculateDegree(x, y);
    System.out.println("Результат возведения в степень = " + result);
}
}
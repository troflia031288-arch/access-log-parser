package ru.courses.product;

public class Sum {
    public static double calculateSum(String[] args) {
        double result = 0;

        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                result += number;
            } catch (NumberFormatException e) {
            }
        }

        return result;
    }
}
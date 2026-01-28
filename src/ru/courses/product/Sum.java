package ru.courses.product;

public class Sum {
    public static double calculateSum(String[] args) {
        double result = 0;

        for (String arg : args) {
            if (Number(arg)) {
                result += Double.parseDouble(arg);
            }
        }

        return result;
    }

    private static boolean Number(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
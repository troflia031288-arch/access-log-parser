package ru.courses.main.Bubble;

public class Bubble {
    public static void bubbleSort(int[] intArray) {
        int a = intArray.length; // длина массива
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
}


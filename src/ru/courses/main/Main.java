package ru.courses.main;
import ru.courses.main.*;

public class Main {
    public static void main(String[] args) {
        // Инициализация массива целых чисел
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        printArray(array);

        // Вызов метода сортировки пузырьком
        ru.courses.main.Bubble.Bubble.bubbleSort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Метод для печати элементов массива
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }
}
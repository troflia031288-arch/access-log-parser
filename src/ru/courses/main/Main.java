package ru.courses.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 16;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }

        System.out.println("Начальный список: " + arrayList);

        for (int i = 0; i < N; i += 2) {
            int a = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 1));
            arrayList.set(i + 1, a);
        }

        System.out.println("Список после перестановки элементов: " + arrayList);
    }
}

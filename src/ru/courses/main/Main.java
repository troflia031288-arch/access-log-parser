package ru.courses.main;

import ru.courses.product.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();

        stats.addEntry("https://testpage.ru/num1", 401, "Chrome", "192.168.1.1");
        stats.addEntry("https://testpage.ru/num2", 200, "Firefox", "192.168.1.2");
        stats.addEntry("https://testpage.ru/num3", 404, "Chrome", "192.168.1.1");
        stats.addEntry("https://testpage.ru/num4", 500, "Yandex", "192.168.1.3");
        stats.addEntry("https://testpage.ru/num5", 404, "Internet Explorer", "192.168.1.1");

        System.out.println("Список страниц с кодом 404: " + stats.getAbsentPages());
        System.out.println("Статистика браузеров: " + stats.getBrowserStatistics());

        stats.setTimePeriod(3.87); // Указываем время в часах, за которое есть записи в логах

        System.out.println("Среднее количество посещений сайта за час: " + stats.averageVisitsPerHour());
        System.out.println("Среднее количество ошибочных запросов за час: " + stats.averageErrorRequestsPerHour());
        System.out.println("Средняя посещаемость одним пользователем: " + stats.averageVisitsPerUser());
    }
}
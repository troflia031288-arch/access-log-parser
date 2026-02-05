package ru.courses.main;
import ru.courses.product.*;


public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();
        
        stats.addEntry("https://testpage.ru/num1", 401, "Chrome");
        stats.addEntry("https://testpage.ru/num2", 200, "Firefox");
        stats.addEntry("https://testpage.ru/num3", 404, "Chrome");
        stats.addEntry("https://testpage.ru/num4", 500, "Yandex");
        stats.addEntry("https://testpage.ru/num5", 404, "Internet Explorer");

        System.out.println("Список страниц с кодом 404: " + stats.getAbsentPages());
        System.out.println("Статистика браузеров: " + stats.getBrowserStatistics());
        

    }

}
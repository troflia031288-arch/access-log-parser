package ru.courses.main;
import ru.courses.product.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();
        
        stats.addEntry("https://testpage.ru/num1", 401, "MacOS");
        stats.addEntry("https://testpage.ru/num2", 200, "MacOS");
        stats.addEntry("https://testpage.ru/num3", 403, "Windows");
        stats.addEntry("https://testpage.ru/num4", 500, "Linux");

        System.out.println("Список страниц с кодом 200: " + stats.getAllPages());
        System.out.println("Статистика операционных систем: " + stats.getOSStatistics());
    }

}
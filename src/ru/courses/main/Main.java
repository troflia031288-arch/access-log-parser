package ru.courses.main;

import ru.courses.product.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();

        stats.addEntry("Yandex/5.2", "192.168.1.1", "http://testpage1.ru", 1622547800);
        stats.addEntry("Mozilla/3.0", "192.168.1.2", null, 1622547803);
        stats.addEntry("Googlebot/2.1", "192.168.1.5", null, 1622547800); // Это бот, будет проигнорирован
        stats.addEntry("Yandex/1.0", "192.168.1.1", "http://testpage3.com", 1622547807);
        stats.addEntry("Mozilla/5.3", "192.168.1.1", "https://testpage2.ru", 1622547801);

        int peakVisits = stats.getPeakVisits();
        System.out.println("Максимальное количество посещений за одну секунду: " + peakVisits);

        HashSet<String> referrerDomains = stats.getReferrerDomains();
        System.out.println("Доменные имена рефереров: " + referrerDomains);

        int maxVisitsByUser = stats.getMaxVisitsByUser();
        System.out.println("Максимальное количество посещений от одного пользователя: " + maxVisitsByUser);
    }
}
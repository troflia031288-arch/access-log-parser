package ru.courses.product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Statistics {
    private Set<String> absentPages;
    private Map<String, Integer> browserNum;
    private Set<String> uniqueUserIPs; // уникальные IP не ботов
    private int totalVisits; // кол-во посещений
    private double hours;   // период времени в часах
    private int errorRequestsNum; // кол-во ошибочных запросов

    public Statistics() {
        absentPages = new HashSet<>();
        browserNum = new HashMap<>();
        uniqueUserIPs = new HashSet<>();
        totalVisits = 0;
        hours = 0;
        errorRequestsNum = 0;
    }

    public void addEntry(String url, int responseCode, String browser, String userIP) {
        if (responseCode == 404) {
            absentPages.add(url);
        }

        if (responseCode >= 400 && responseCode < 600) {
            errorRequestsNum++;
        }

        if (browser != null) {
            browserNum.put(browser, browserNum.getOrDefault(browser, 0) + 1);
            if (!browser.toLowerCase().contains("bot")) {
                totalVisits++;
                uniqueUserIPs.add(userIP);
            }
        }
    }

    public Set<String> getAbsentPages() {
        return absentPages;
    }

    public Map<String, Double> getBrowserStatistics() {
        Map<String, Double> browserStatistics = new HashMap<>();
        int totalNum = 0;

        for (int count : browserNum.values()) {
            totalNum += count;
        }

        if (totalNum == 0) {
            return browserStatistics;
        }

        for (Map.Entry<String, Integer> entry : browserNum.entrySet()) {
            String browserName = entry.getKey();
            int count = entry.getValue();
            double proportion = (double) count / totalNum;
            browserStatistics.put(browserName, proportion);
        }
        return browserStatistics;
    }

    public void setTimePeriod(double hours) { // Изменено на double
        this.hours = hours;
    }

    public double averageVisitsPerHour() {
        if (hours == 0) {
            return 0;
        }
        return totalVisits / hours; // Используем double для деления
    }

    public double averageErrorRequestsPerHour() {
        if (hours == 0) {
            return 0;
        }
        return errorRequestsNum / hours; // Используем double для деления
    }

    public double averageVisitsPerUser() {        if (uniqueUserIPs.isEmpty()) {
        return 0;
    }
        return (double) totalVisits / uniqueUserIPs.size();
    }
}
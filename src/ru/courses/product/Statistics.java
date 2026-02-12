package ru.courses.product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Statistics {
    private Map<String, Integer> visitsOfOneUser = new HashMap<>();
    private HashSet<String> referrerDomains = new HashSet<>();
    private Map<Integer, Integer> visitsInOneSecond = new HashMap<>();
    private int totalVisits; // кол-во посещений
 //   private double hours;   // период времени в часах
 //   private int errorRequestsNum; // кол-во ошибочных запросов

    public Statistics() {
        totalVisits = 0;
   //     hours = 0;
   //     errorRequestsNum = 0;
    }

    public void addEntry(String userAgent, String ipAddress, String referer, int timestamp) {
        if (userAgent != null && userAgent.toLowerCase().contains("bot")) {
            return;
        }

        visitsInOneSecond.put(timestamp, visitsInOneSecond.getOrDefault(timestamp, 0) + 1);
        visitsOfOneUser.put(ipAddress, visitsOfOneUser.getOrDefault(ipAddress, 0) + 1);

        if (referer != null) {
            String domain = extractDomain(referer);
            if (domain != null) {
                referrerDomains.add(domain);
            }
        }

        totalVisits++;
    }

    public int getPeakVisits() {
        return visitsInOneSecond.values().stream()
                .max(Integer::compare)
                .orElse(0);
    }

    public HashSet<String> getReferrerDomains() {
        return referrerDomains;
    }

    public int getMaxVisitsByUser() {
        return visitsOfOneUser.values().stream()
                .max(Integer::compare)
                .orElse(0);
    }

    private String extractDomain(String url) {
        try {
            java.net.URL aURL = new java.net.URL(url);
            return aURL.getHost();
        } catch (Exception e) {
            return null;
        }
    }
}
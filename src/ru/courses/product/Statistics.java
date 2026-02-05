package ru.courses.product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Statistics {
    private HashSet<String> pages;
    private HashMap<String, Integer> numberOfOs;

    public Statistics() {
        pages = new HashSet<>();
        numberOfOs = new HashMap<>();
    }

    public void addEntry(String url, int responseCode, String os) {
        if (responseCode == 200) {
            pages.add(url);
        }

        if (os != null) {
            numberOfOs.put(os, numberOfOs.getOrDefault(os, 0) + 1);
        }
    }

    public HashSet<String> getAllPages() {
        return pages;
    }

    public HashMap<String, Double> getOSStatistics() {
        HashMap<String, Double> osEntry = new HashMap<>();
        int totalNum = 0;

        for (int count : numberOfOs.values()) {
            totalNum += count;
        }

        if (totalNum == 0) {
            return osEntry;
        }

        for (Map.Entry<String, Integer> entry : numberOfOs.entrySet()) {
            String osName = entry.getKey();
            int count = entry.getValue();
            double proportion = (double) count / totalNum;
            osEntry.put(osName, proportion);
        }

        return osEntry;
    }
}

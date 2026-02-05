package ru.courses.product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Statistics {
    private Set<String> absentPages;
    private Map<String, Integer> browserCounts;

    public Statistics() {
        absentPages = new HashSet<>();
        browserCounts = new HashMap<>();
    }

    public void addEntry(String url, int responseCode, String browser) {
        if (responseCode == 404) {
            absentPages.add(url);
        }

        if (browser != null) {
            browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);
        }
    }

    public Set<String> getAbsentPages() {
        return absentPages;
    }

    public Map<String, Double> getBrowserStatistics() {
        Map<String, Double> browserStatistics = new HashMap<>();
        int totalNum = 0;

        for (int count : browserCounts.values()) {
            totalNum += count;
        }

        if (totalNum == 0) {
            return browserStatistics;
        }

        for (Map.Entry<String, Integer> entry : browserCounts.entrySet()) {
            String browserName = entry.getKey();
            int count = entry.getValue();
            double proportion = (double) count / totalNum;
            browserStatistics.put(browserName, proportion);
        }

        return browserStatistics;
    }
}

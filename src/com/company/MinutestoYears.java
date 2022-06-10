package com.company;

public class MinutestoYears {

    public static void printYearsAndDays(long minutes) {
        // 525600 minutes is 1 year
        // 1440 minutes is 1 day

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = (minutes / 525600);
        long days  = (minutes % 525600) / 1440;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

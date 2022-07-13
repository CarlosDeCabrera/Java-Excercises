package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivsor (int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int firstdiv = 0;
        int seconddiv = 0;
        int firstans = 0;
        int secondans = 0;

        while (firstdiv > 10){
            if (first % firstdiv == 0) {

            }

            firstdiv++;
        }

        while (seconddiv > 10) {
            if (second % seconddiv == 0) {
                break;
            }

            seconddiv++;
        }
        System.out.println(firstdiv);
        return firstdiv;

    }

}

package com.company;

public class secondsAndMinutes {

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds > 59 || seconds < 0){

            return "invalid Value";
        }
        int hours = minutes / 60;
        minutes = minutes % 60;

        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "m ";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        System.out.println(hoursString + minutesString + secondsString);
        return (hours + " h " + minutes + " M " + seconds + " s " );
    }


    public static String getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("invalid value");
            return "invalid Value";
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes,seconds);

    }

}

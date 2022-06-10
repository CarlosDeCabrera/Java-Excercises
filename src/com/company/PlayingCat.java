package com.company;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (!summer){
            if(temperature < 25 || temperature > 35){
                return false;
            }else
                return true;
        }else if(summer){
            if(temperature < 25 || temperature > 45)
                return false;

        }return true;
    }
}

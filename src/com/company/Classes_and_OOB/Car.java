package com.company.Classes_and_OOB;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("honda")){

            this.model = model;
        }else {
            this.model = "unKnown";
        }

    }

    public String getModel(){
        return this.model;
    }

    public static class SumCalculator {
    }
}

package com.company.Classes_and_OOB;

public class Wall {

    private double height;
    private double width;


    public Wall(){

        this(0.0, 0.0);

    }

    public Wall(double width, double height) {
        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }


        if (width < 0){
            this.width = 0;
        }else{
            this.width = width;
    }
    }

    public double getHeight() {

        return this.height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0;
        }else {
        this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
       if (width < 0){
           width = 0;
       }else {
        this.width = width;
        }
    }

    public double getArea(){
        if (this.height < 0 || this.width < 0){
            return 0;
        }
        return this.height * this.width;

    }


}

package com.company.Classes_and_OOB;

public class Wall {

    private double height;
    private double width;
    private double area;
    public Wall(){
        this(1.0, 1.0);
    }

    public Wall(double height, double width) {
        if (height < 0){
            this.height = 0;
        }
        this.height = height;

        if (width < 0){
            this.height = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
       if (width < 0){
           width = 0;
       }
        this.width = width;
    }

    public double getArea(){
        return this.area = this.height * this.width;

    }


}

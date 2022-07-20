package com.company.Classes_and_OOB;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((getY() - 0) * (getY() - 0) + (getX() - 0) * (getX() - 0));
    }

    public double distance(int x, int y){
        return Math.sqrt((getY() - y) * (getY() - y) + (getX() - x) * (getX() - x));
    }

    public double distance(Point xy){
        return Math.sqrt( (getX() - xy.getX()) * ( getX() - xy.getX()) + (getY() - xy.getY() ) * (getY() - xy.getY()));
    }

}

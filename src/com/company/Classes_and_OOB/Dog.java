package com.company.Classes_and_OOB;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("walk");
        move(25);
    }

    public void run() {
        System.out.println("run");
        move(50);
    }

    private void moveLegs(int speed) {
        System.out.println("dog.moveLegs called");
    }

    @Override
    public void move ( int speed){
            System.out.println("dog.move called");
            moveLegs(speed);
            super.move(speed);
    }

}

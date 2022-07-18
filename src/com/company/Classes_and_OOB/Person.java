package com.company.Classes_and_OOB;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0){
            age = 0;
        }

        this.age = age;
    }

    public boolean isTeen(){
        if (this.age <= 12 || this.age >= 20){
            return false;
        }
        return true;
    }

    public String getFullName(){
        if (firstName.isEmpty()){
            return this.lastName;
        }else if(lastName.isEmpty()){
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }

}
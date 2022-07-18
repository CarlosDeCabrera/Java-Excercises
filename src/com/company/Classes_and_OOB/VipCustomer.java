package com.company.Classes_and_OOB;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Default", 5000, "Defualt@email.com");

    }

    public VipCustomer(String name,int creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email){
        this(name, 1000, email);

    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }


    public String getEmail() {
        return email;
    }



}

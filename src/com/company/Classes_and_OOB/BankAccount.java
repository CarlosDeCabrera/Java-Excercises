package com.company.Classes_and_OOB;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String PhoneNumber;

    public BankAccount(){
        this("548454", 250.00, "default", "default","Default");
        System.out.println("empty constructor called");
    }
    // this. is better than setter
    public BankAccount(String accountNumber, double balance, String customerName,String email, String phoneNumber){
        System.out.println("this worked");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.PhoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999", 100.55 ,customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void deposit(double depositMoney){
        this.balance += depositMoney;
        System.out.println(" you deposited : " + depositMoney + " dollars");
    }

    public void withdraw(double withdrawMoney){
        if (this.balance - withdrawMoney < 0){
            System.out.println("You do not have enough money");
        }else{
            this.balance -= withdrawMoney;
            System.out.println(" You withdrew : " + withdrawMoney + " dollars");

        }

    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */package banksystem;
public  abstract class BankAccount {
    public abstract void calcuateInterest();
    private String name;
  private  String surname;
  private int accountNumber;
   double balance;

    public BankAccount(String name, String surname, int accountNumber, double balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }


    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount+"  deposited TL /"+"balance:"+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
}   else{
            System.out.println("  invalid balance");         
                    }
        }
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   
}



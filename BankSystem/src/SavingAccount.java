/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */package banksystem;
public class SavingAccount extends BankAccount {

    public SavingAccount(String name, String surname, int accountNumber, double balance) {
        super(name, surname, accountNumber, balance);
    }

  
   

    @Override
    public void calcuateInterest() {
        double interest=balance*0.05;
        balance+=interest;
        System.out.println(balance+"  added the interested");
        
    }
    
}

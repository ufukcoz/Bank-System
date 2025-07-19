/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

/**
 *
 * @author hp
 */
public class CurrentAccount extends BankAccount{

    public CurrentAccount(String name, String surname, int accountNumber, double balance) {
        super(name, surname, accountNumber, balance);
    }



  
    @Override
    public void calcuateInterest() {
        System.out.println("Interest dont apply this account type. ");
    }
    
}

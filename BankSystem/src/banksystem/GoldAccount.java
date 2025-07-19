/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

/**
 *
 * @author hp
 */
public class GoldAccount extends BankAccount{

    public GoldAccount(String name, String surname, int accountNumber, double balance) {
        super(name, surname, accountNumber, balance);
    }



    @Override
    public void calcuateInterest() {
        double interest=balance*0.07;
        if(balance>20000){
            interest=balance*0.01;
            System.out.println("extra Interest");
        } 
        balance+=interest;
        System.out.println(balance+" added goldaccount ");
    }
    
}

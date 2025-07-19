/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banksystem;

/**
 *
 * @author hp
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount saving=new SavingAccount("ufuk","çöz",389939872,12000);
        saving.calcuateInterest();
        BankAccount current=new CurrentAccount("ali","mojarrad",40504904,30000);
        current.deposit(500);
        BankAccount gold=new GoldAccount("can","uş",292992929,21000);
        gold.calcuateInterest();
    }
    
}

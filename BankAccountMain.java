/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pemlan;

/**
 *
 * @author Aurel
 */
class BankAccountMain {
    public static void main(String[] args){
 
        BankAccount AAA = new BankAccount("12345678", "Abecede Eefgeha", "Tabungan");
        BankAccount BBB = new BankAccount("45678901", "Ijekael Emeno", "Giro");
        
        AAA.displayInfo();
        AAA.deposit(200.0);
        AAA.withdraw(150.0);
        AAA.transfer(BBB, 50.0);
                
        BBB.displayInfo();
        BBB.deposit(100.0);
        BBB.withdraw(300.0);
        BBB.transfer(AAA, 75.0);

    }
}

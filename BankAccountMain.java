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
 
        BankAccount AAA = new BankAccount("12345678", "Abecede Eefgeha", 20000.0, "Tabungan");
        BankAccount BBB = new BankAccount("45678901", "Ijekael Emeno", 30000.0, "Giro");
        
        AAA.displayInfo();
        AAA.deposit(5000.0);
        AAA.withdraw(15000.0);
        AAA.transfer(BBB, 10000.0);
                
        BBB.displayInfo();
        BBB.deposit(5000.0);
        BBB.withdraw(15000.0);
        BBB.transfer(AAA, 12500.0);

    }
}

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
        
        AAA.displayInfo(); //menampilkan informasi akun AAA
        AAA.deposit(200.0); //melakukan deposit sebesar 200, saldo bertambah 200 dari semula
        AAA.withdraw(150.0); // melakukan withdraw sebesar 150, saldo berkurang 150
        AAA.transfer(BBB, 50.0); //melakukan transfer ke BBB sebesar 50, saldo berkurang 50, saldo BBB bertambah 50
                
        BBB.displayInfo(); //menampilkan informasi akun BBB
        BBB.deposit(100.0); //melakukan deposit sebesar 100, saldo bertambah 100 dari semula
        BBB.withdraw(300.0); // melakukan withdraw sebesar 300, saldo berkurang 300
        BBB.transfer(AAA, 75.0); //melakukan transfer ke AAA sebesar 75, saldo berkurang 75

    }
}

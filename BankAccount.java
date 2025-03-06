/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pemlan;

/**
 *
 * @author Aurel
 */
public class BankAccount {
    //field
    public String noRek;
    public String namaPemilik;
    public double saldo;
    public String jenisAkun;
    
    //constructor
    public BankAccount (String noRek, String namaPemilik, double saldo, String jenisAkun){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.jenisAkun = jenisAkun;
    }
    public BankAccount (String noRek, String namaPemilik, String jenisAkun){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.jenisAkun = jenisAkun;
        if (jenisAkun.equals("Tabungan")){ // untuk menentukkan saldo berdasarkan jenis akun
            this.saldo = 100.0;
        } else if (jenisAkun.equals("Giro")){
            this.saldo = 500.0;
        }
    }
    
    //menampilkan data 
    public void displayInfo(){ 
        System.out.println("Nomor Rekening = " +noRek);
        System.out.println("Nama Pemilik = "+ namaPemilik);
        System.out.println("Saldo = "+ saldo); 
        System.out.println("Jenis Akun = "+ jenisAkun); 
        System.out.println("");
    }
    public void deposit(double nominal){ 
        if (nominal <= 0){
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo= nominal + saldo;
            System.out.println("Jumlah sebanyak "+nominal+" berhasil didepositkan");
        }
    }
    public void withdraw(double nominal){
        if (nominal <= 0 ){
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal){
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo = saldo - nominal;
            System.out.println("Jumlah sebanyak "+nominal+ " berhasil ditarik");
        }
    }
    public void transfer(BankAccount tujuan, double nominal){
        if (nominal <= 0 ){
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal){
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            saldo = saldo - nominal;
            tujuan.saldo = tujuan.saldo + nominal;
            System.out.println("Berhasil mengirim sebesar " +nominal+ " ke nomor rekening " +tujuan.noRek+ "\n"+"Sisa saldo: "+saldo);
        }
        System.out.println("----------------------------------------------------");
    }
}

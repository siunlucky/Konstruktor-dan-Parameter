/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2121;

/**
 *
 * @author FAIZ
 */
public class Main {

        //Variable Luar
    String programming = "Java";
    int angka = 77;
    
    //Konstruktor dengan 2 Parameter
    public Main(String programming_baru, int angka_baru){
        programming = programming_baru;
        angka = angka_baru;
    }
    
    public static void main(String[] args){
        //Objek Pertama
        Main data1 = new Main("Swift", 700);
        //Objek Kedua
        Main data2 = new Main("c++", 457);
        //Mencetak Nilai dari Objec Pertama
        System.out.println("====== DATA1 ======");
        System.out.println(data1.programming);
        System.out.println(data1.angka);
        //Mencetak Nilai dari Objec Kedua
        System.out.println("====== DATA2 ======");
        System.out.println(data2.programming);
        System.out.println(data2.angka);
    }
}
    

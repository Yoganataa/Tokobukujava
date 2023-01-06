/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.Tugas;

/**
 *
 * @author AVEYNATA
 */
public class Main {
    public static void main(String[] args) {
       Main main = new Main();
       main.tampilkanSemua();
    }

    private void tampilkanSemua() {
         //Down Castin
        Penjumlahan penjumlahan = new Penjumlahan(10.5, 0.5);
        ((OperasiBilangan)penjumlahan).tampilkan();
        //Up Casting
        Perkalian perkalian = new Perkalian(10.5, 0.5);
        OperasiBilangan operasiBilangan =  (OperasiBilangan)perkalian;
        operasiBilangan.tampilkan();
        
        Pembagian pembagian = new Pembagian(10.5, 0.5);
        pembagian.tampilkan();  
        
        Pengurangan pengurangan = new Pengurangan(10.5, 0.5);
        ((OperasiBilangan)pengurangan).tampilkan();
    } 
}
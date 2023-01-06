/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.Polimor;

/**
 *
 * @author AVEYNATA
 */
public class Penyanyi {
    String nama="Unkown";

    public Penyanyi() {
        System.out.println("Nama Penyanyinya null");
    }
    public Penyanyi(String nama){
        System.out.println("Penyanyina: "+nama);
    }
    public String nama(String nama){
        return this.nama =  nama;
    }
    protected void genre(String genre){
        System.out.println("Genre-nya: umumD");
    }
    
}

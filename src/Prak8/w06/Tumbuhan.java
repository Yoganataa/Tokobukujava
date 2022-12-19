/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.w06;

/**
 *
 * @author ACER
 */
public class Tumbuhan {

    public String getNama() {
        return nama;
    }

    private String getWarna() {
        return warna;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    private String nama;
    protected String warna;

    public Tumbuhan() {
        System.out.println("Constructor kosong di class tumbuhan");
    }

    public Tumbuhan(int jumlahBiji, String nama) {
        System.out.println("Construktor dua parameter");
    }
    void cetak(){
        System.out.println("Nama Tumbuhan");
    }
    
    
    
}

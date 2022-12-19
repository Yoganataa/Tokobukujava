/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.TugasTokoBukuNata;

/**
 *
 * @author ACER
 */
// Kelas Buku
public class Buku {
    
    // Atribut
    private String judul;
    private String namaPengarang;
    private String penerbit;
    private int tahunCetak;
    private String kategori;
    //id
    private String author;
    private int nim;
    // Setter dan getter untuk setiap atribut
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
      public String getJudul() {
        return judul;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setTahunCetak(int tahunCetak) {
        this.tahunCetak = tahunCetak;
    }

    public int getTahunCetak() {
        return tahunCetak;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
    public void Uthor(){
          System.out.println("Daftar Buku Yang tersedia :");
      } 
}
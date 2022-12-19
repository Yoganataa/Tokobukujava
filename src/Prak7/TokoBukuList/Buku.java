/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.TokoBukuList;

/**
 *
 * @author ACER
 */
// Kelas Buku
class Buku {
  // Atribut
  private String judul;
  private String namaPengarang;
  private String penerbit;
  private int tahunCetak;
  private String kategori;
  // Setter dan getter untuk setiap atribut
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
}

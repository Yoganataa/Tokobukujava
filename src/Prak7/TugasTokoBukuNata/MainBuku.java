/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.TugasTokoBukuNata;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class MainBuku extends Buku{

  @Override
  public void Uthor() {
        System.out.print("----------------------------------------\nTugas Ini Dikerjakan oleh ");
  }

    @Override
    public int getNim() {
        return super.getNim(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNim(int nim) {
        super.setNim(nim); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
  
  public static void main(String[] args) {
      // Buat list untuk menyimpan data buku
      Scanner scan = new Scanner(System.in);
      // Buat instance dari kelas Buku
      MainBuku buku = new MainBuku();
      //isi atribut buku menggunakan setter dengan scanner
      System.out.print("Masukkan judul buku: ");
      buku.setJudul(scan.nextLine());
      System.out.print("Masukkan nama pengarang: ");
      buku.setNamaPengarang(scan.nextLine());
      System.out.print("Masukkan penerbit: ");
      buku.setPenerbit(scan.nextLine());
      System.out.print("Masukkan tahun cetak: ");
      buku.setTahunCetak(scan.nextInt());
      scan.nextLine();
      System.out.print("Masukkan kategori (su = semua umur, r = remaja, d = dewasa, a = anak): ");
      buku.setKategori(scan.nextLine());
      System.out.print("\n\n-----------------------------------\nMasukkan Nama: ");
      buku.setAuthor(scan.nextLine());

    // Tampilkan buku yang diinputkan
      System.out.println("\nDaftar Buku:");
      System.out.println("Judul: " + buku.getJudul());
      System.out.println("Pengarang: " + buku.getNamaPengarang());
      System.out.println("Penerbit: " + buku.getPenerbit());
      System.out.println("Tahun Cetak: " + buku.getTahunCetak());
      System.out.println("Kategori: " + buku.getKategori());
      buku.Uthor();
      buku.setNim(0073);
      System.out.print(buku.getAuthor()+" | "+buku.getNim());

    }
  }


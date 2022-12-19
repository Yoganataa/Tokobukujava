/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.TokoBukuList;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MainToko extends Buku {
  public static void main(String[] args) {
    // Buat list untuk menyimpan data buku
    ArrayList<Buku> daftarBuku = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      Buku buku = new Buku();
      // Set nilai atribut buku menggunakan setter
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
      // Tambahkan instance buku ke list
      daftarBuku.add(buku);
    }
    // Tampilkan informasi semua buku yang tersimpan dalam list
    System.out.println("\nDaftar Buku\n+---------------+---------------+---------------+---------------+---------------+");
    System.out.println("| Judul         | Pengarang     | Penerbit      | Tahun Cetak   | Kategori      |");
    System.out.println("+---------------+---------------+---------------+---------------+---------------+");
    for (Buku buku : daftarBuku) {
        System.out.println(String.format("| %-13s | %-13s | %-13s | %-13s | %-13s |", buku.getJudul(), buku.getNamaPengarang(), buku.getPenerbit(), buku.getTahunCetak(), buku.getKategori()));
    }
    System.out.println("+---------------+---------------+---------------+---------------+---------------+");
//      System.out.println("Judul: " + buku.getJudul());
//      System.out.println("Pengarang: " + buku.getNamaPengarang());
//      System.out.println("Penerbit: " + buku.getPenerbit());
//      System.out.println("Tahun Cetak: " + buku.getTahunCetak());
//      System.out.println("Kategori: " + buku.getKategori());
//      System.out.println();
    }
  }

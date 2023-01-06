/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak9.Tugas;

/**
 *
 * @author AVEYNATA
 */
public class Fakultas implements Informatika, Siskom{
    
    //method dari interface informatika
    @Override
    public void dekan1() {
        System.out.println("Ini adalah dekan 1 dari turunan interface Informatika");
    }

    @Override
    public void dosen1() {
        System.out.println("Ini adalah dosen 1 dari turunan interface Informatika");
    }

    @Override
    public void mhs1() {
        System.out.println("Ini adalah mahasiswa 1 dari turunan interface Informatika");
    }
    
    //method dari interface siskom

    @Override
    public void dekan2() {
        System.out.println("Ini adalah dekan 2 dari turunan interface siskom");
    }

    @Override
    public void dosen2() {
        System.out.println("Ini adalah dosen 2 dari turunan interface siskom");
    }

    @Override
    public void mhs2() {
        System.out.println("Ini adalah mahasiswa 2 dari turunan interface siskom");
    }
    
    
}

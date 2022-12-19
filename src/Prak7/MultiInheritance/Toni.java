/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.MultiInheritance;

import Prak7.MultiInheritance.Ibuinterface;
import Prak7.MultiInheritance.Ayahinterface;
import Prak7.MultiInheritance.Kakek;

/**
 *
 * @author ACER
 */
public class Toni extends Kakek implements Ayahinterface, Ibuinterface {
//    public void cetak(){
//        System.out.println(Ayah.cetak);
//        System.out.println(Ibu.cetak);
//        super.cetak();
//    }
    
    @Override
    public void cetak() {
       Ayahinterface.super.cetak();
       Ibuinterface.super.cetak();
       super.cetak();
    }

    public static void main(String[] args) {
        Toni toni = new Toni();
        toni.cetak();
    }
    
}

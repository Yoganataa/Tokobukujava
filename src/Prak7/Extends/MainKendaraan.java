/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.Extends;

import Prak7.Extends.Kendaraan;

/**
 *
 * @author ACER
 */
public class MainKendaraan extends Kendaraan {

    @Override
    public void jalankan() {
        System.out.println("Matic");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public void setMesin(String mesin) {
        System.out.println("Besar Mesin: "+mesin);
    }
    @Override
    public String getMesin() {
        return super.getMesin();
    }
    public static void main(String[] args) {
//        MainKendaraan mainkendaraan  = new MainKendaraan();
//        mainkendaraan.jalankan();
        MainKendaraan mainkendaraan  = new MainKendaraan();
        mainkendaraan.setMesin("150 cc");
        System.out.println(mainkendaraan.getMesin());
    }
    
}

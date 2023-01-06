/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.DownCasting;

/**
 *
 * @author AVEYNATA
 */
public class TestMobil {
    Mobil mobil1;

    public TestMobil() {
        mobil1 = new Mobil();
        mobil1.ngebut();
//        ((MobilBalap)mobil1).ngebut();
    }
    public static void main(String[] args) {
        TestMobil testMobil = new TestMobil();
    }
//    Method missing, karena method ngebut tidak ada pada superclass
//   tambahkan method pada superclass(Mobil.java) atau gunakan downcasting di subclass(MobilBalap.java)
}

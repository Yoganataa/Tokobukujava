/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.StaticBinding;

/**
 *
 * @author AVEYNATA
 */
public class MainIPS {
    public static void main(String[] args) {
        IPS ips  = new Sosiologi();
        ips.showMapel();
        
        Sosiologi sosiologi = new Sosiologi();
        sosiologi.showMapel();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7.VMI;

import Prak7.VMI.HitungLuas;
import Prak7.VMI.PersegiPanjang;
import javax.xml.transform.Source;

/**
 *
 * @author ACER
 */
public class ContohVMI {
    public static void main(String[] args) {
        HitungLuas hitungLuas = new PersegiPanjang();
        System.out.println("Panjang: "+hitungLuas.panjang);
        System.out.println("Lebar: "+hitungLuas.lebar);
        hitungLuas.luas();
    }
}

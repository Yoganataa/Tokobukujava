/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.w06;

/**
 *
 * @author ACER
 */
public class Mamalia {
    String hewan, suara;

    public Mamalia() {
    }

    public Mamalia(String hewan) {
        this.hewan = hewan;
    }

    public Mamalia(String hewan, String suara) {
        this.hewan = hewan;
        this.suara = suara;
    }
    public void voice(String suara){
        System.out.println("Suaranya: "+suara);
    }
    public void voice(String suara, String hewan){
        System.out.println("Hewan: "+hewan+"Suaranya: "+suara);
    }
}

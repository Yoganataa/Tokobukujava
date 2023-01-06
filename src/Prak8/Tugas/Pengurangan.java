/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak8.Tugas;

/**
 *
 * @author AVEYNATA
 */
public class Pengurangan extends OperasiBilangan{
    protected double a=10.5, b=0.5;
    public Pengurangan(double a, double b) {
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    @Override
     protected void tampilkan() {
        System.out.println("Hasil pengurangan =" +(a-b));
    }
}

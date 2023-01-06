/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak9.Abstract;

/**
 *
 * @author AVEYNATA
 */
public class Kalkulus extends Matematika{
    public static void main(String[] args) {
        Kalkulus kalkulus = new Kalkulus();
        kalkulus.methodA();
        kalkulus.methodB();
    }

    @Override
    void methodA() {
        System.out.println("Method A");
    }
    
}

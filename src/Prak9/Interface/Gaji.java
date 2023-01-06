/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak9.Interface;

/**
 *
 * @author AVEYNATA
 */
public class Gaji extends Pegawai implements Pajak{
    double gaji;

    public Gaji(double gaji, String nama) {
        super(nama);
        this.gaji = gaji;
    }

    @Override
    void Detail() {
        System.out.println("Nama pegawai: "+this.nama);
        this.gaji=gaji-hitungPajak();
        System.out.println("Gajinya: "+this.gaji);
    }

    @Override
    public double hitungPajak() {
        return (this.gaji*(PERSEN/100));
    }
    
    
    
}

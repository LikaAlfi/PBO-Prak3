/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumTugas;

/**
 *
 * @author SYSTEM SSSD SATA
 */
public class Pekerja extends Manusia {
    private double gaji;   // atribut tambahan khusus pekerja

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString
    @Override
    public String toString() {
        return "Nama: " + getNama() +
               "\nUsia: " + usia +
               "\nPekerjaan: " + pekerjaan +
               "\nGaji: " + gaji;
    }
}

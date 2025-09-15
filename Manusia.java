/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumTugas;

/**
 *
 * @author SYSTEM SSSD SATA
 */
public class Manusia {
    private String nama;       // hanya bisa diakses dalam kelas ini
    protected int usia;        // bisa diakses dalam package & subclass
    public String pekerjaan;   // bisa diakses dari mana saja

    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

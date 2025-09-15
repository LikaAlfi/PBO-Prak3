/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumTugas;

/**
 *
 * @author SYSTEM SSSD SATA
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Lintang", 27, "Programmer", 8000000);

        // Menampilkan informasi pekerja dengan toString()
        System.out.println("=== Informasi Nama Pekerja ===");
        System.out.println(pekerja1.gaji);

        System.out.println("\nCatatan: Atribut private tidak bisa diakses langsung dari luar kelas.");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author SYSTEM SSSD SATA
 */
public class praktikum_PBO4 {
    
    public static void main(String[] args) {
        // Membuat objek mobil
        mobil mobil1 = new mobil("Toyota Avanza", 180, "Bensin", 4);
        mobil mobil2 = new mobil("Honda Civic", 220, "Bensin Turbo", 4);
        mobil mobil3 = new mobil("Suzuki APV", 160, "Diesel", 5);

        // Menampilkan informasi mobil
        System.out.println("=== Informasi Mobil 1 ===");
        mobil1.tampilkanInfoKendaraan();  // method dari class induk Kendaraan
        mobil1.tampilkanInfoMobil();      // method dari class Mobil

        System.out.println("\n=== Informasi Mobil 2 ===");
        mobil2.tampilkanInfoKendaraan();
        mobil2.tampilkanInfoMobil();

        System.out.println("\n=== Informasi Mobil 3 ===");
        mobil3.tampilkanInfoKendaraan();
        mobil3.tampilkanInfoMobil();
    }
}


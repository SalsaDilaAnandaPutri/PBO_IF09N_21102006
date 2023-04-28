package com.SalsaDilaAnandaPutri.PBO.Pertemuan2;

import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        // Buat objek Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Inputan user untuk drop informasi gaji, tunjangan, dan pajak
        System.out.print("Masukkan gaji Anda: ");
        double gaji = scanner.nextDouble();
        System.out.print("Masukkan tunjangan Anda: ");
        double tunjangan = scanner.nextDouble();
        double pajak = 7.65;

        // Hitung gaji kotor, pajak negara, dan gaji bersih
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * (pajak / 100);
        double gajiBersih = gajiKotor - pajakNegara;

        // Cetak hasil perhitungan
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji kotor: " + gajiKotor);
        System.out.println("Pajak negara (" + pajak + "%): " + pajakNegara);
        System.out.println("Gaji bersih: " + gajiBersih);

        // Cetak kalimat hasil perhitungan
        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih + ".");

        // Tutup objek Scanner
        scanner.close();
    }
}
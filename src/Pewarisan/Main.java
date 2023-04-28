package Pewarisan;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penduduk_2006[] pendudukArray = new Penduduk_2006[4]; // Array untuk menyimpan objek Nelayan dan Dokter

        for (int i = 0; i < 4; i++) {
            System.out.println("Penduduk " + (i + 1));
            System.out.print("Masukkan NIK: ");
            String nik_2006 = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Peran (Nelayan/Dokter): ");
            String peran = scanner.nextLine();

            if (peran.equalsIgnoreCase("Nelayan")) {
                Nelayan_2006 nelayan = new Nelayan_2006(nik_2006, nama, umur, alamat);
                System.out.print("Masukkan Jumlah Berat Ikan (kg): ");
                double jumlahBeratIkan = scanner.nextDouble();
                System.out.print("Masukkan Jumlah Pakai Solar (liter): ");
                int jumlahPakaiSolar = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer

                nelayan.inputJumlahBeratIkan(jumlahBeratIkan);
                nelayan.inputJumlahPakaiSolar(jumlahPakaiSolar);

                pendudukArray[i] = nelayan;
            } else if (peran.equalsIgnoreCase("Dokter")) {
                Dokter_2006 dokter = new Dokter_2006(nik_2006, nama, umur, alamat);
                System.out.print("Masukkan Jumlah Pasien: ");
                int jumlahPasien = scanner.nextInt();
                System.out.print("Masukkan Jumlah Obat (botol): ");
                int jumlahObat = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer

                dokter.inputJumlahPasien(jumlahPasien);
                dokter.inputJumlahObat(jumlahObat);

                pendudukArray[i] = dokter;
            } else {
                System.out.println("Peran yang dimasukkan tidak valid.");
                i--; // Mengulangi input untuk penduduk yang sama
            }
        }

        System.out.println("\nData Penduduk:");
        for (Penduduk_2006 penduduk : pendudukArray) {
            if (penduduk instanceof Nelayan_2006) {
                ((Nelayan_2006) penduduk).tampilDataNelayan();
            } else if (penduduk instanceof Dokter_2006) {
                ((Dokter_2006) penduduk).tampilDataDokter();
            }
            System.out.println("----------------------------");
        }
    }

}

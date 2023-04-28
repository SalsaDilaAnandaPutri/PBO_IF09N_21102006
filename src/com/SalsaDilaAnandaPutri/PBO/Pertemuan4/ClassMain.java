package com.SalsaDilaAnandaPutri.PBO.Pertemuan4;

import java.util.Scanner;
public class ClassMain {
    public static void main(String[] args) {
        TokoBuku tokoBuku = new TokoBuku();
        Scanner scanner = new Scanner(System.in);
        boolean pilih = true;

        while (pilih) {
            System.out.println("****Classic Bookstore****");
            System.out.println("1. Pilih Buku Fiksi");
            System.out.println("2. Pilih Buku Non-Fiksi");
            System.out.println("3. Menampilkan Daftar Buku Yang Anda Pilih");
            System.out.println("4. Exit");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\n===== BUKU FIKSI =====\n");
                    System.out.print("Masukkan Judul: ");
                    String judulFiksi = scanner.nextLine();
                    System.out.print("Masukkan Pengarang: ");
                    String pengarangFiksi = scanner.nextLine();
                    System.out.print("Masukkan Genre: ");
                    String genreFiksi = scanner.nextLine();
                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, pengarangFiksi, genreFiksi);
                    tokoBuku.tambahBuku(bukuFiksi);
                    System.out.println("Buku Fiksi yang anda pilih berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.print("\n===== BUKU NON-FIKSI =====\n");
                    System.out.print("Masukkan Judul: ");
                    String judulNonFiksi = scanner.nextLine();
                    System.out.print("Masukkan Pengarang: ");
                    String pengarangNonFiksi = scanner.nextLine();
                    System.out.print("Masukkan Subjek: ");
                    String subjekNonFiksi = scanner.nextLine();
                    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, pengarangNonFiksi, subjekNonFiksi);
                    tokoBuku.tambahBuku(bukuNonFiksi);
                    System.out.println("Buku Non-Fiksi yang anda pilih berhasil ditambahkan!\n");
                    break;
                case 3:
                    tokoBuku.tampilkanDaftarBuku();
                    break;
                case 4:
                    pilih = false;
                    System.out.println("Terima kasih telah memilih untuk menggunakan program Toko Buku Ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi!\n");
                    break;
            }
        }
    }
}

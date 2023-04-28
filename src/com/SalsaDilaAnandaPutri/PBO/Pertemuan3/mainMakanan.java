package com.SalsaDilaAnandaPutri.PBO.Pertemuan3;

import java.util.Scanner;
import java.util.ArrayList;
public class mainMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<LayananMakanan> paketList = new
                ArrayList<LayananMakanan>();
        LayananMakanan nasi = new LayananMakanan ("Paket 1 : Paket Nasi Box", "1 nasi box dengan menu utama, sayur, dan buah", 20000);
                LayananMakanan snack = new LayananMakanan ("Paket 2 : Paket Snack Box", "1 snack box dengan pilihan snack beragam", 15000);
                LayananMakanan buffet = new LayananMakanan ("Paket 3 : Paket Buffet", "Menu makanan dan minuman lengkap untuk 50 orang", 500000);
                // menambahkan paket layanan ke dalam list
                paketList.add(nasi);
        paketList.add(snack);
        paketList.add(buffet);
        // menampilkan paket layanan yang tersedia
        System.out.println("DAFTAR PAKET LAYANAN MAKANAN\n");
        for (LayananMakanan paket : paketList) {
            System.out.println(paket.toString());
        }
        // meminta input dari user untuk memilih paket layanan
        System.out.print("\nMasukkan nomor paket yang ingin dibeli (pisahkan dengan spasi jika lebih dari satu): ");
        String[] inputPaket = input.nextLine().split(" ");
        ArrayList<LayananMakanan> selectedPaketList = new
                ArrayList<LayananMakanan>();
        for (String nomor : inputPaket) {

            selectedPaketList.add(paketList.get(Integer.parseInt(nomor) - 1));
        }
        int totalBiaya = 0;
        for (LayananMakanan paket : selectedPaketList) {
            totalBiaya += paket.getBiaya();
        }
        System.out.println("Anda telah memilih paket layanan : ");
        for (LayananMakanan paket : selectedPaketList) {
            System.out.println(paket.toString());
        }
        System.out.println("Total Biaya : Rp " + totalBiaya);
    }
}

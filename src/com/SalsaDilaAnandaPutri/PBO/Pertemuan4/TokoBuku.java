package com.SalsaDilaAnandaPutri.PBO.Pertemuan4;

import java.util.ArrayList;
public class TokoBuku {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang anda cari ditoko buku ini.");
        } else {
            System.out.println("\nDaftar Buku: ");
            for (Buku buku : daftarBuku) {
                buku.displayInfo();
                System.out.println("---------------------\n");
            }
        }
    }
}

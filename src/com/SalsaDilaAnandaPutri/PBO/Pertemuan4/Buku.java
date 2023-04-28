package com.SalsaDilaAnandaPutri.PBO.Pertemuan4;

public class Buku {
    protected String judul;
    protected String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
    }
}

package Pewarisan;

public class Penduduk_2006 {
    String nik_2006;
    String nama;
    int umur;
    String alamat;
    String peran;

    Penduduk_2006(String nik_2006, String nama, int umur, String alamat, String peran) {
        this.nik_2006 = nik_2006;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.peran = peran;
    }

    void tampilData() {
        System.out.println("NIK: " + nik_2006);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
    }
}

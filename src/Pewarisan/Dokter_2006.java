package Pewarisan;

public class Dokter_2006 extends Penduduk_2006 {
    int jumlahPasien;
    int jumlahObat;

    Dokter_2006(String nik_2006, String nama, int umur, String alamat) {
        super(nik_2006, nama, umur, alamat, "Dokter");
    }

    void inputJumlahPasien(int jumlahPasien) {
        this.jumlahPasien = jumlahPasien;
    }

    void inputJumlahObat(int jumlahObat) {
        this.jumlahObat = jumlahObat;
    }

    double hitungPendapatan() {
        return (jumlahPasien * 50000) + (jumlahObat * 10000);
    }

    void tampilDataDokter() {
        tampilData();
        System.out.println("Peran: " + peran);
        System.out.println("Jumlah Pasien: " + jumlahPasien);
        System.out.println("Jumlah Obat: " + jumlahObat + " botol");
        System.out.println("Total Pendapatan: Rp " + hitungPendapatan());
    }
}
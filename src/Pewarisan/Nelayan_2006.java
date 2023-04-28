package Pewarisan;

public class Nelayan_2006 extends Penduduk_2006{
    double jumlahBeratIkan;
    int jumlahPakaiSolar;

    Nelayan_2006(String nik_2006, String nama, int umur, String alamat) {
        super(nik_2006, nama, umur, alamat, "Nelayan");
    }

    void inputJumlahBeratIkan(double jumlahBeratIkan) {
        this.jumlahBeratIkan = jumlahBeratIkan;
    }

    void inputJumlahPakaiSolar(int jumlahPakaiSolar) {
        this.jumlahPakaiSolar = jumlahPakaiSolar;
    }

    double hitungPendapatan() {
        return (jumlahBeratIkan * 8000) - (jumlahPakaiSolar * 10000);
    }

    void tampilDataNelayan() {
        tampilData();
        System.out.println("Peran: " + peran);
        System.out.println("Jumlah Berat Ikan: " + jumlahBeratIkan + " kg");
        System.out.println("Jumlah Pakai Solar: " + jumlahPakaiSolar + " liter");
        System.out.println("Total Pendapatan: Rp " + hitungPendapatan());
    }
}

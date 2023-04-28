package com.SalsaDilaAnandaPutri.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajerkan1 = new Manajer();
        Pegawai pegawaikan1 = new Pegawai();

        manajerkan1.nip = 123456789;
        manajerkan1.nama = "Salsa Dila";

        pegawaikan1.nip = 987654321;
        pegawaikan1.nama = "Ananda Putri";

        manajerkan1.showInfo();
        manajerkan1.extraInfo();
        manajerkan1.bonus(1200000);
        manajerkan1.bonus();

        pegawaikan1.showInfo();
    }
}

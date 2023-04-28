package com.SalsaDilaAnandaPutri.PBO.Pertemuan3;

public class LayananMakanan {
    private String namaPaket;
    private String benefit;
    private int biaya;
    public LayananMakanan(String namaPaket, String benefit,
                          int biaya){
        this.namaPaket = namaPaket;
        this.benefit = benefit;
        this.biaya = biaya;
    }
    public String getNamaPaket(){
        return namaPaket;
    }
    public String getBenefit(){
        return benefit;
    }
    public int getBiaya(){
        return biaya;
    }
    public void setNamaPaket (String namaPaket){
        this.namaPaket = namaPaket;
    }
    public void setBenefit (String benefit){
        this.benefit = benefit;
    }
    public void setBiaya (int biaya){
        this.biaya = biaya;
    }
    public String toString() {
        return namaPaket + "\nBenefit : " + benefit + "\nBiaya: Rp " + biaya + "\n";
    }
}

package com.SalsaDilaAnandaPutri.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        //Looping do
        for (int i=0; i<10; i++){
            System.out.println("Looping...("+i+")");
        }
        System.out.println("Looping for selesai!");
        //Looping while
        int j=1;
        while (j<=100){
            System.out.println("Looping While...("+j+")");
            j+=10;
        }
        System.out.println("Looping While selesai!");
// Looping do while
        int k = 10;
        do{
            System.out.println("Looping do while...("+k+")");
            k--;
        }
        while (k>0);
        System.out.println("Looping do while selesai!");
    }
}

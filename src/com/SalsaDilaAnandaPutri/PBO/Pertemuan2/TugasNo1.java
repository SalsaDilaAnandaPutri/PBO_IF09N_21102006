package com.SalsaDilaAnandaPutri.PBO.Pertemuan2;

import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user_06 = "Salsa Dila";
        String pass_06 = "21102006";
        System.out.println("Masukan Username Anda : ");
        String user = input.nextLine();
        System.out.println("Masukan Password Anda : ");
        String pass = input.nextLine();
        if (user.equals(user_06) && pass.equals(pass_06)) {
            System.out.println("Login berhasil silahkan masuk");
        } else if (user != (user_06) && pass.equals(pass_06))
        {
            System.out.println("Username anda salah");
        } else if (user.equals(user_06) && pass != (pass_06))
        {
            System.out.println("Password yang anda masukkan salah");
        } else {
            System.out.println("Silahkan login dengan memasukkan username dan password yang sah!");
        }
    }
}

package com.SalsaDilaAnandaPutri.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println(bilangan1 + "/" + bilangan2 + " = " + hasil +);

        }
        //Multiple Exception
        //   catch (ArithematicException | InputMismatchException e) {
        //        System.out.println(" Eror gess. Tidak dapat di proses :)");
    }
        //Multiple Catch
        catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Eror gess. Tidak dapat di proses :)");
        }


    {   catch (InputMismatchException  e) {
        System.out.println("Masukkan angka saja yooo :)");

    }

        System.out.println("Proses sudah selese yooo :)");
    }

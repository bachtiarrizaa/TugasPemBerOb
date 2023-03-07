/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugastiga;

/**
 *
 * @author lenovo
 */


import java.util.Scanner;

public class Calkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, pilih, result= 0;
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------");
 
        // input
        System.out.print("Masukan Angka Ke-1: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Angka ke-2: ");
        angka2 = input.nextInt();
 
        System.out.print("Masukan Operasi: ");
        pilih = input.nextInt();
 
        switch (pilih)
        {
            case 1 : result = angka1 + angka2; break;
            case 2 : result = angka1 - angka2; break;
            case 3 : result = angka1 / angka2; break;
            case 4 : result = angka2 * angka2; break;
            case 5 : result = angka1 % angka2; break;
            default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
        }
        System.out.println("Hasil: " + result);
    }
}


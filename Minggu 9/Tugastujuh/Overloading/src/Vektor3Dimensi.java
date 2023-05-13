/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.Arrays;

/**
 *
 * @author Windows 10
 */
public class Vektor3Dimensi {
    public int [] vektor;

    public Vektor3Dimensi(int [] vektor){
        this.vektor = vektor;
    }
    public int[] kali(int skalar){
        int[] hasil = new int[this.vektor.length];
        for (int i = 0; i < vektor.length; i++) {
            hasil[i]= this.vektor[i] * skalar;
        }
        return hasil;
    }
    public int kali(int[] vektor){
        int hasil = 0;
        for (int i = 0; i < vektor.length; i++) {
            hasil += (this.vektor[i] * vektor[i]);
        }
        return hasil;
    }
}

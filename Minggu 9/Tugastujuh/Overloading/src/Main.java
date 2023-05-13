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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vektor3Dimensi vector = new Vektor3Dimensi(new int []{1,2,3});
        //perkalian skalar
        System.out.println(Arrays.toString(vector.kali(5)));
        //perkalian vektor
        System.out.println(vector.kali(new int[]{4,5,6}));
        
    }
    
}

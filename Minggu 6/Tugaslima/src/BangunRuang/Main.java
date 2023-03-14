/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class Main {

    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus[] cube = new Kubus[5];
        cube[0] = new Kubus(2);
        cube[1] = new Kubus(4);
        cube[2] = new Kubus(6);
        cube[3] = new Kubus(8);
        cube[4] = new Kubus(3);
        
        double[] volume= new double[cube.length];
        for (int i = 0; i < cube.length; i++) {
            System.out.print("Kubus "+(i+1));
            System.out.print(", Sisi = "+ cube[i].cube_side);
            System.out.print(", Volume = "+ cube[i].getVolume());
            System.out.println();
            System.out.println("-----------------------------------------");
            volume[i] = cube[i].getVolume();
        }
        double hasil = 0;
        for (double temp : volume) {
            hasil += temp;
        }
        hasil /= volume.length;
        System.out.println("rata-rata = "+hasil); 
        }    
}

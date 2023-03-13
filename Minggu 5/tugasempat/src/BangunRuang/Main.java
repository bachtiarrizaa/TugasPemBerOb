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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus cube = new Kubus (5);
        System.out.println("Kubus");
        System.out.println("Sisi Kubus : " + cube.cube_side);
        System.out.println("Volume Kubus : " + cube.getVolume());
        
        
        Balok cuboid = new Balok(2,4,6);
        System.out.println("\nBalok");
        System.out.println("Panjang Balok : " + cuboid.cuboid_length);
        System.out.println("Lebar Balok : " + cuboid.cuboid_wide);
        System.out.println("Tinggi Balok : " + cuboid.cuboid_height);
        System.out.println("Volume Balok : " + cuboid.getVolume());
        
        Tabung cylinder = new Tabung(7,4);
        System.out.println("\nTabung");
        System.out.println("Jari-jari Tabung : " + cylinder.cylinder_radius);
        System.out.println("Tinggi Tabung : " + cylinder.cylinder_height);
        System.out.println("Volume Tabung : " + cylinder.getVolume());
        
        LimasSegiEmpat pyramid = new LimasSegiEmpat(4,6);
        System.out.println("\nLimas Segi Empat");
        System.out.println("Sisi Limas Segi Empat : " + pyramid.pyramid_side);
        System.out.println("Tinggi Limas Segi Empat : " + pyramid.pyramid_heigth);
        System.out.println("Volume Limas Segi Empat : " + pyramid.getVolume());
        
        Bola ball = new Bola(7);
        System.out.println("\nBola");
        System.out.println("Jari-jari Bola : " + ball.ball_radius);
        System.out.println("Volume Bola : " + ball.getVolume());
    }
    
}

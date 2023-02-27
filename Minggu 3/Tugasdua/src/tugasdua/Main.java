/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdua;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
        Square persegi = new Square();
        System.out.println("Luas persegi adalah " + persegi.calculatearea());
        persegi.calculatearea();
        System.out.println("Keliling persegi adalah " + persegi.calculateperimeter());
        persegi.calculateperimeter();
        Rectangle persegipanjang = new Rectangle();
        System.out.println("Luas Persegi Panjang adalah " + persegipanjang.calculatearea());
        persegipanjang.calculatearea();
        System.out.println("Keliling Persegi Panjang adalah " + persegipanjang.calculateperimeter());
        persegipanjang.calculateperimeter();
        Circle lingkaran = new Circle();
        System.out.println("Luas Lingkaran adalah " + lingkaran.calculatearea());
        lingkaran.calculatearea();
        System.out.println("Keliling Lingkaran adalah " + lingkaran.calculateperimeter());
        lingkaran.calculateperimeter();
        Ellipse elips = new Ellipse();
        System.out.println("Luas Elips adalah " + elips.calculatearea());
        elips.calculatearea();
        System.out.println("Keliling Elips adalah " + elips.calculateperimeter());
        elips.calculateperimeter();
    }
}

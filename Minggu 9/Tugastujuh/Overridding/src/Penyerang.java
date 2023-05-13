/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Penyerang extends Pemain {
    protected String type;
    public Penyerang(String nama, int umur, String klub, String type ){
        super(nama, umur,klub);
        this.type = type;
    }
    public void lari() {
    System.out.println("Nama Pemain : " + this.nama + " | Umur : " + this.umur + " | Klub : " + this.klub + " | Type : " + this.type + " Berlari");
    }
}

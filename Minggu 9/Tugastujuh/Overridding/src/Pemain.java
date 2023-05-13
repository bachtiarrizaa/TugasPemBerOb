/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Pemain {
    protected String nama;
    protected int umur;
    protected String klub;
    public Pemain(String nama, int umur,  String klub){
        this.nama = nama;
        this.umur = umur;
        this.klub = klub;
    }
    public void info(){
        System.out.println("Nama Pemain : " + this.nama + " | Umur : " + this.umur+" | Klub : " + this.klub);
    }
}

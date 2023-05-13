/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */

public class Majalah extends Koleksi{
    public String edisi;
    public Majalah(String edisi, String judul, String penerbit, int tahun){
        super(judul,penerbit,tahun);
        this.edisi = edisi;
    }
    public String toString(){
        return this.judul + ", " + this.edisi + ", " + this.penerbit + ", " + this.tahun;
    }
}


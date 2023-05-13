/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Buku extends Koleksi{
    public String penulis;
    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul,penerbit,tahun);
        this.penulis = penulis;
    }
    public String toString(){
        return this.judul+", " + this.penulis + ", " + this.penerbit + ", " + this.tahun;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Skripsi extends Buku {
    public String npm;
    public Skripsi(String NPM, String judul, String penulis, String penerbit, int tahun){
        super(judul,penulis,penerbit,tahun);
        this.npm = NPM;
    }
    public String toString(){
        return this.npm + ", " + this.penulis + ", " + this.judul + ", " + this.penerbit + ", " + this.tahun;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Koleksi {
    public String judul;
    public String penerbit;
    public int tahun;
    
    public Koleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public String toString(){
        return this.judul + ", " + this.penerbit + ", " + this.tahun;
    }
}

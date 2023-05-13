/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koleksi koleksii = new Koleksi("Adinda","SIDU",2002);
        System.out.println(koleksii.toString());
        
        Buku bukuu = new Buku("Siksa Neraka","Andik", "Laskar" ,2015);
        System.out.println(bukuu.toString());
        
        Majalah majalahh = new Majalah("Bobo","Siang","BOBOK", 2021);
        System.out.println(majalahh.toString());
        
        Skripsi skripsii = new Skripsi("12333123","Sulistyo","PHP SEBAGAI BAHASA PROGRAM","SatuRasa",2023);
        System.out.println(skripsii.toString());
    }
    
}

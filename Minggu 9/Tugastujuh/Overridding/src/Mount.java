/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Mount extends Penyerang {
    protected int goal;
    protected final String nama = "Mason Mount";

    public Mount(String nama, int umur, String klub, String type) {
        super(nama, umur, klub, type);
    }

    public void goal() {
        System.out.println("Nama Pemain : " + this.nama + " | Umur : " + this.umur + " | Type : " + this.type + " Mencetak Goal");
    }

    public String goal(int goal) {
        this.goal = goal;
        return "Nama Pemain : " + this.nama + " | Umur : " + this.umur + " | Klub : " + this.klub + " | Type : " + this.type + " Mencetak Goal " + this.goal;
    }

    public void info() {
        System.out.println("Nama Pemain : " + this.nama + " | Umur : " + this.umur + " | Klub : " + this.klub + " | Type : " + this.type + " | Jumlah Goal : " + this.goal);
    }
}

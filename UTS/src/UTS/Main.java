/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek Bus dan Halte
        Bus bus = new Bus(20);

        // Penumpang awal
        bus.naikPenumpang(new Penumpang("PORONG"));
        bus.naikPenumpang(new Penumpang("PORONG"));
        bus.naikPenumpang(new Penumpang("PORONG"));
        bus.naikPenumpang(new Penumpang("GRESIK"));
        bus.naikPenumpang(new Penumpang("GRESIK"));

        System.out.println("------------------------------------------");
        System.out.println("OUTPUT:");
        System.out.println("------------------------------------------");
        System.out.println("-> Bus Berangkat dari PULL/Kantor");
        System.out.println("   - Jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("   - 3 penumpang turun di Halte PORONG");
        System.out.println("   - 2 penumpang turun di Halte GRESIK");
        System.out.println("------------------------------------------");

        System.out.println("-> Halte Porong: 2 Penumpang menunggu");
        System.out.println("-> Bus Sampai di Halte PORONG");
        bus.turunPenumpang(3);
        System.out.println("   - 3 penumpang turun");
        bus.naikPenumpang(new Penumpang("Surabaya"));
        bus.naikPenumpang(new Penumpang("Gresik"));
        System.out.println("   - 2 penumpang naik");
        System.out.println("      - tujuan Surabaya");
        System.out.println("      - tujuan Gresik");
        System.out.println("   - jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Porong: 0 Penumpang menunggu");
        System.out.println("------------------------------------------");

        System.out.println("-> Halte Surabaya: 5 Penumpang menunggu");
        System.out.println("-> Bus Sampai di Halte SURABAYA");
        bus.turunPenumpang(1);
        System.out.println("   - 1 penumpang turun");
        bus.naikPenumpang(new Penumpang("Gresik"));
        bus.naikPenumpang(new Penumpang("Gresik"));
        bus.naikPenumpang(new Penumpang("Gresik"));
        bus.naikPenumpang(new Penumpang("Gresik"));
        bus.naikPenumpang(new Penumpang("Gresik"));
        System.out.println("   - 5  penumpang naik");
        System.out.println("   - jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Surabaya: 0 Penumpang menunggu");
        System.out.println("------------------------------------------");
    }
}
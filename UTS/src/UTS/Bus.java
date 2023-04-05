/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author lenovo
 */
public class Bus {
    private int jumlahPenumpang;
    private int kapasitasMaksimal;
    private Penumpang penumpang[];

    public Bus(int kapasitasMaksimal) {
        this.jumlahPenumpang = 0;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.penumpang = new Penumpang[kapasitasMaksimal];
    }

    public void naikPenumpang(Penumpang penumpang) {
        if (jumlahPenumpang < kapasitasMaksimal) {
            this.penumpang[jumlahPenumpang] = penumpang;
            jumlahPenumpang++;
        }
    }

    public void turunPenumpang(int jumlah) {
        if (jumlahPenumpang > 0) {
            jumlahPenumpang -= jumlah;
        }
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }
}

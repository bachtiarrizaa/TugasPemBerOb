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
        Pemain pemainn = new Pemain("Mason Mount",23,"Chelsea");
        Penyerang penyerangg = new Penyerang("Mason Mount",23,"Chelsea","CAM");
        Mount mason = new Mount("Mason Mount",23,"Chelsea", "CAM");
        
        penyerangg.lari();
        mason.lari();
        System.out.println(mason.goal(25));
        System.out.println("Info Pemain");
        pemainn.info();
        System.out.println("Statistik Pemain");
        mason.info();
        
        
    }
    
}

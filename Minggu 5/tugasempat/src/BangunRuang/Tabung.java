/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class Tabung {
    public double cylinder_radius;
    public double cylinder_height;
    public double volume;
    public Tabung (double cylinder_radius, double cylinder_height){
        this.cylinder_radius = cylinder_radius;
        this.cylinder_height = cylinder_height;
    }
    public void setSylinderRadius(double cylinder_radius){
        this.cylinder_radius = cylinder_radius;
    }
    public void setSylinderHeight(double cylinder_height){
        this.cylinder_height = cylinder_height;
    }
    public void computerAndSetVolume(){
        double cal_vol = 3.14*this.cylinder_radius*this.cylinder_radius*this.cylinder_height;
        this.volume = cal_vol;
    }
    public double getVolume(){
        this.computerAndSetVolume();
        return this.volume;
    }
}

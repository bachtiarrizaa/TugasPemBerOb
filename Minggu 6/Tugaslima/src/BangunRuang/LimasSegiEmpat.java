/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class LimasSegiEmpat {
    public double pyramid_side;
    public double pyramid_heigth;
    public double volume;
    public LimasSegiEmpat(double pyramid_side, double pyramid_height){
        this.pyramid_side = pyramid_side;
        this.pyramid_heigth = pyramid_height;
    }
    public void setPyramidSide(double pyramid_side){
      this.pyramid_side = pyramid_side;  
    }
    public void setPyramidHeight(double pyramid_height){
        this.pyramid_heigth = pyramid_height;
    }
    public void computeAndSetVolume(){
        double cal_vol = (this.pyramid_side*this.pyramid_side*this.pyramid_heigth)/3;
        this.volume = cal_vol;
    }
    public double getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}

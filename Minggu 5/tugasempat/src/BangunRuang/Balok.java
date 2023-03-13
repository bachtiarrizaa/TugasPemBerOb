/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class Balok {
    int cuboid_length;
    int cuboid_wide;
    int cuboid_height;
    int volume;
    public Balok(int cuboid_length, int cuboid_wide, int cuboid_height){
        this.cuboid_length = cuboid_length;
        this.cuboid_wide = cuboid_wide;
        this.cuboid_height = cuboid_height;
    }
    public void setCuboidLength(int cuboid_length){
        this.cuboid_length = cuboid_length;
    }
    public void setCuboidWide(int cuboid_length){
        this.cuboid_length = cuboid_length;
    }
    public void setCuboidHeight(int cuboid_height){
        this.cuboid_height = cuboid_height;
    }
    public void computeAndSetVolume(){
        //compute volume
        int cal_vol = this.cuboid_length*this.cuboid_length*this.cuboid_height;
        this.volume = cal_vol;
    }
    public int getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}

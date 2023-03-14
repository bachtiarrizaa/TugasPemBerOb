/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class Kubus {
    public int cube_side;
    public int volume;
    public Kubus(int cube_side){
        this.cube_side = cube_side;
    }
    public void setCubeSide(int cube_side){
        this.cube_side = cube_side;
    }
    public void computeAndSetVolume(){
        //compute volume
        int cal_vol = this.cube_side*this.cube_side*this.cube_side;
        this.volume = cal_vol;
    }
    public int getVolume(){
        this.computeAndSetVolume();
        return this.volume;
    }
}

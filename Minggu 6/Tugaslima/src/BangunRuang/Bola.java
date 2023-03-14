/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author lenovo
 */
public class Bola {
    public double ball_radius;
    public double volume;
    public Bola(double ball_radius){
        this.ball_radius = ball_radius;
    }
    public void setBallRadius(double ball_radius){
        this.ball_radius = ball_radius;
    }
    public void computeAndSerVolume(){
        double cal_vol = (4*3.14*this.ball_radius*this.ball_radius*this.ball_radius)/3;
        this.volume = cal_vol;
    }
    public double getVolume(){
        this.computeAndSerVolume();
        return this.volume;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdua;

/**
 *
 * @author lenovo
 */
public class Rectangle {
    public int lebar = 6;
    public int panjang = 3;
    public int calculatearea(){
        int area;
        area = this.panjang * this.lebar;
        return area;
    }
    public int calculateperimeter(){
        int perimeter;
        perimeter = 2 * (this.panjang + this.lebar);
        return perimeter;
    }
}

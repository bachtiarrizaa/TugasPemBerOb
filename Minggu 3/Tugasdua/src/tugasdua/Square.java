/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdua;

/**
 *
 * @author lenovo
 */
public class Square {
    public int lengthofside = 8;
    public int calculatearea(){
        int area;
        area = this.lengthofside * this.lengthofside;
        return area;
    }
    public int calculateperimeter(){
        int perimeter;
        perimeter = 4 * this.lengthofside;
        return perimeter;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdua;

/**
 *
 * @author lenovo
 */
public class Circle {
    public int jarijari = 7;
    public int diameter = 14;
    public float calculatearea(){
        float area;
        area = (float) (3.14 * this.jarijari * this.jarijari);
        return area;
    }
    public float calculateperimeter(){
        float perimeter;
        perimeter = (float) (3.14 * this.diameter);
        return perimeter;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdua;

/**
 *
 * @author lenovo
 */
public class Ellipse {
    int a = 8;
    int b = 3;
    public float calculatearea(){
        float area;
        area = (float) (3.14 * this.a * this.b);
        return area;
    }
    public float calculateperimeter(){
        float perimeter;
        perimeter = (float) (3.14 * (this.a + this.b)/2);
        return perimeter;
    }
}

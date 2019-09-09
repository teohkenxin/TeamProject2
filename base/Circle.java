package base;
import myInterface.*;

/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shape
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private double radius;
    
    /**
     * Constructor for objects of class Circle
     */
    public Circle(int x, int y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea(){ //면적?�� 계산?��?�� 메소?�� 
        double area = PI * (this.radius * this.radius);
        return area;
    }
    
    public void draw(){ // ?��?��?�� 그리?�� 메소?�� 
        System.out.println("반�?름이 " + this.radius + "?�� ?��?��?��?��.");
    }
}

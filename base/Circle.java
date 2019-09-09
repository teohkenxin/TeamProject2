package base;
import myInterface.*;

/**
 * Shape interface부터 메소드를 상속받고 equals() 어버라이딩 한 클래스입니다
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/09)
 */
public class Circle implements Shape
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;
    public double radius;
    
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
    
    public boolean equals(Circle obj){
        boolean result = true;

        if (this.x != obj.x){
            result = false;
        }
        else if (this.y != obj.y){
            result = false;
        }
        return result;
    }
}

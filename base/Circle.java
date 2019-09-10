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
    public int x;
    public int y;
    public double radius;
    
    public Circle(int x, int y, double radius) // Constructor
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea(){  // calculation 
        double area = PI * (this.radius * this.radius);
        return area;
    }
    
    public void draw(){ 
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

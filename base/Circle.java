package base;
import myInterface.*;

/**
 * Shape interface부터 메소드를 상속받고 equals() 어버라이딩한 Circle클래스입니다
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/10)
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

    public boolean equals(Circle obj){ //두개의 원을 비교해서 중심이 같은지 안같은지를 확인하는 매소드입니다.
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

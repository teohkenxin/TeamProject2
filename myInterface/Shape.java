package myInterface;


/**
 * 상수와 추상메소드를 가지고있는 인터페이스입니다.
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/04)
 */
public interface Shape
{
    final double PI = 3.14; // 상수
    
    
    void draw(); // 도형을 그리는 추상 메소드
    
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    
    default public void redraw(){ // 디폴트 메소드
        System.out.print("--- 다시 그립니다. "); 
        draw(); 
    } 
}


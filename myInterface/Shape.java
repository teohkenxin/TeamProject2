package myInterface;



/**
 * Circle 클라스에 상수와 메소드를 상속하는 interface입니다
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/04)
 */
public interface Shape
{
    final double PI = 3.14; // �?수
    
    
    void draw(); // �?�형�?� 그리는 추�? 메소드
    
    double getArea(); // �?�형�?� 면�?�?� 리턴하는 추�? 메소드
    
    default public void redraw(){ // 디�?�트 메소드
        System.out.print("--- 다시 그립니다. "); 
        draw(); 
    } 
}


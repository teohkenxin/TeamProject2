package myInterface;

/**
 * Circle 클라스에 상수와 여러 메소드들을 상속하는 interface입니다
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/10)
 */
public interface Shape
{
    final double PI = 3.14; // 상수

    void draw(); 

    double getArea();
}

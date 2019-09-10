package main;
import base.*;

/**
 * MyApp 가지고 있는 메인 메소드 
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/10)
 */

public class MyApp
{

    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 : " + c1);
        System.out.println("원2 : " + c2);
        if(c1.equals(c2)){
            System.out.println("같은 원");
        }else{
            System.out.println("서로 다른 원");
        }
    }

}

package main;
import base.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

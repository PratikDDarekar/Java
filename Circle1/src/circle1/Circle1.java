/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle1;


public class Circle1 {

 double radius;
 
 public double area()
 {
     return Math.PI*radius*radius;
 }
  public double perimeter()
 {
     return 2*Math.PI*radius;
 }
   public double circumference()
 {
     return perimeter();
 }   
}

class CircleTest{

     public static void main(String[] args)
    {
      Circle1 c1 = new Circle1();
      Circle1 c2 = new Circle1();
        c1.radius=6;
        c2.radius=16;
        
        
        System.out.println("area1 :"+c1.area());
         System.out.println("perimeter1 : "+c1.perimeter());
          System.out.println("circumference1 : "+c1.circumference());
        
        System.out.println();
       
        System.out.println("area2 :"+c2.area());
         System.out.println("perimeter2 : "+c2.perimeter());
          System.out.println("circumference2 : "+c2.circumference());
        
    }}
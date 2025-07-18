/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

public class Rectangle {

        int length;
        int breadth;
        
        public int area()
        {
            return length*breadth;
        }
              
      public int perimeter()
        {
            return (2*area());
        }
      
      public boolean isSquare()
      {
          return length==breadth;
      }
           
}
class RectangleTest{

public static void main(String []args){
 
    Rectangle r1 = new Rectangle();
    r1.length =5;
     r1.breadth =5;
    
     System.out.println("Area of Rectangle : "+ r1.area());
     System.out.println("Perimeter of Rectangle : "+ r1.perimeter());
     System.out.println("Is it a Square : "+ r1.isSquare());

}
}
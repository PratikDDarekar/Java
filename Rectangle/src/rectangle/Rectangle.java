/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

public class Rectangle {

        private int length;
        private int breath;
        
        public int area()
        {
            return length*breath;
        }
         public void setLength(int l)
         {
             length = l;
         }
         public void setBreath(int b)
         {
             breath= b;
         }
         
         public int getLength()
         {
             return length;
         }
         public int getBreath()
         {
             return breath;
         }
              
      public int perimeter()
        {
            return (2*area());
        }
      
      public boolean isSquare()
      {
          return length==breath;
      }
           
}
class RectangleTest{

public static void main(String []args){
 
    Rectangle r1 = new Rectangle();
    r1.setLength(5);
     r1.setBreath(10);
    
     System.out.println("Area of Rectangle : "+ r1.area());
     System.out.println("Perimeter of Rectangle : "+ r1.perimeter());
     System.out.println("Is it a Square : "+ r1.isSquare());

      System.out.println( r1.getLength());
      System.out.println( r1.getBreath());
              


}
}
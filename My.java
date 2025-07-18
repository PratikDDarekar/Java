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

public class My
{

       public static void main(String[] args)
    {
      My c1 = new My();
  
        m1.radius=6;
    
        
        System.out.println("area :"+m1.area());
         System.out.println("perimeter : "+m1.perimeter());
          System.out.println("circumference : "+m1.circumference());
       
        
    }
}
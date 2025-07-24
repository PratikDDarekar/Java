
package abstarctclass2;


public class AbstarctClass2 {
   // public static void main(String[] args) { }    
}

abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape
{
    double radius;
    
    public Circle(double radius)//constructor
    {
        this.radius = radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape
{
    double width;
    double height;
    
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
      public double area()
    {
        return width*height;
    }
     public double perimeter()
    {
        return 2*area();
    } 
}

class Test
{
     public static void main(String[] args) 
     {
         System.out.println("Circle : ");
         
       //  Shape s = new Circle(20); //or
        Circle s = new Circle(20);
           System.out.println(s.area());
           System.out.println(s.perimeter());
            //OR
        Shape s3 = s;
        System.out.println(s3.area());
         
          System.out.println("Rectangle : ");
           
        //Rectangle s2 = new Rectangle(5,8);  //or
         Shape s2 = new Rectangle(5,8);
           System.out.println(s2.area());
           System.out.println(s2.perimeter());
           
       
         
     }  
}
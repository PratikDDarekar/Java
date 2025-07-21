
package inheritance;



class Circle
{
    public double radius;
    
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
class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return height*perimeter();
    }    
}

class Test
{
     public static void main(String[] args) 
     {
         Cylinder cy = new Cylinder();
         cy.radius=15;
         cy.height=10;
         System.out.println("Cylinder volume: "+cy.volume());
          System.out.println("Cylinder circumference: "+cy.circumference());
           System.out.println("Cylinder area: "+cy.area());
            System.out.println("Cylinder perimeter: "+cy.perimeter());
            
             System.out.println();
         
         Circle cir = new Circle();
         cir.radius=3;
          System.out.println("Circle area: "+cir.area());
           System.out.println("Circle circumference: "+cir.circumference());
            System.out.println("Circle perimeter: "+cir.perimeter());
     }
    
}
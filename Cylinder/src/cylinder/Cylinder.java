/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cylinder;

/**
 *
 * @author darek
 */
public class Cylinder {

    double radius;
    double height;
    
    public double lidArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
    
      public double totalSurfaceArea()
    {
        return ((2*Math.PI*radius*height)+(2*Math.PI*(radius*radius)));
    }
      
      
    public double volume()
    {
        return (Math.PI*(radius*radius)*height);
    }
}
class CylinderTest{
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cylinder cy = new Cylinder();
        cy.height=10;
        cy.radius=12;
        
     System.out.println("Lid Area of a Cylinder : "+(float) cy.lidArea());
     System.out.println("totalSurface Area ofa Cylinder : "+(float) cy.totalSurfaceArea());
     System.out.println("volume  of a Cylinder : "+(float) cy.volume());
        
    }
    
}

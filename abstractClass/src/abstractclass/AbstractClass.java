/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;


public class AbstractClass {
 //   public static void main(String[] args) {  }
}

abstract class Super
{
    public Super()
    {
        System.out.println("Constructor executed");
    }
    
    public void Meth1()
    {
        System.out.println("Meth1 executed");
    }
    abstract void Meth2();
}

class Sub extends Super
{
    void Meth2()
    {
        System.out.println("Overrided method of abstract super class executed");
    }
}
class Test
{
     public static void main(String[] args) 
     {
        // Super s1 = new Sub;//no dynamic method dispatch of abstract super class 
         //Super s1 = new Super; // can't create an object of abstract class
         Sub s = new Sub();
         s.Meth1();
         s.Meth2();
     }
}
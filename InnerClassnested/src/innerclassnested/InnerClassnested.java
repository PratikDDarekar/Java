/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innerclassnested;


class Outer
{
    int x=10;
    //OR
   // Inner i = new Inner();  //we can write it here also because sequence doesn't matter in java it matters in c;
    
    class Inner
    {
        int y=20;
        
        void displayInner()
        {
            System.out.println("Inner : y = "+y+", Outer : x = "+x);
        }
    }
    
    void displayOuter()
    {        
        Inner i = new Inner();//to use inner class we need to make its object
        
        i.displayInner();
        System.out.println(i.y);
    }
}

class Test
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.displayOuter();
    }
}



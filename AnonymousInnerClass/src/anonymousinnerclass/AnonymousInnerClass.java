/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonymousinnerclass;


//Anonymoue class

//eg1 by using abstract class

//abstract class My
//{
//    abstract public void show();
//}
//
//class Outer2
//{
//    public void display()
//    {
////        My m = new My(){ public void show(){System.out.println("hii!");}}; //with reference
////        m.show();
//        
//        //OR
//      new My(){ public void show(){System.out.println("hii!");}}.show(); //without reference
//       
//    }
//}
//class Test2
//{
//   public static void main(String[] args)
//   {
//        Outer2 o2 = new Outer2();
//        o2.display();
//   }            
//}




//eg2 by using interface
interface  My
{
    abstract public void show();
}

class Outer2
{
    public void display()
    {
//        My m = new My(){ public void show(){System.out.println("hii!");}}; //with reference
//        m.show();
        
        //OR
      new My(){ public void show(){System.out.println("hii!");}}.show(); //without reference
       
    }
}
class Test2
{
   public static void main(String[] args)
   {
        Outer2 o2 = new Outer2();
        o2.display();
   }            
}
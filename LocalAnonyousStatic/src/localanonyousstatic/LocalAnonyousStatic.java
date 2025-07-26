
package localanonyousstatic;

public class LocalAnonyousStatic{}//Inner classes
//
//class Outer
//{
//    public void display()
//    {
//        class Inner
//        {
//            public void show()
//            {
//                System.out.println("hello");
//            }
//        }
//      //Inner i = new Inner(); //by creating the references
//      //i.show();
//      
//      //OR
//      
//      new Inner().show(); //without creating reference and there is no name to the object so this is an anonymous object
//    }   
//}
//class Test
//{
//   public static void main(String[] args)
//   {
//        Outer o = new Outer();
//        o.display();
//   }            
//}
 


////Anonymoue class

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

//interface  My
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




//Static Inner Class

class Outer
{
    int x =5;
    static int y=6;
    
    static class My
    {
      public void view()
      {
       System.out.println(y+" = y");//in static we can't use non-static variable   
      } 
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Outer.My oi = new Outer.My();
        oi.view();
    }
}
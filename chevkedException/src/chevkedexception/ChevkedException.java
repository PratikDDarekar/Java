


//checked Exception
package chevkedexception;
import java.io.*;


public class ChevkedException  {

   static void fun1()
   {
   FileInputStream fi=new   FileInputStream("My.txt");
   }
   static void fun2()
   {
       fun1();
   }
   static void fun3()
   {
       fun2();
   }        
    public static void main(String[] args) {
       fun3();
    }   
}
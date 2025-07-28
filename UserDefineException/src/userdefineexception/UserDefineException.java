/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userdefineexception;


class LowBalException extends Exception
{
    public String toString()
    {
        return "Balance should not be less than 5000";
    }
}

public class UserDefineException {

   static void fun1()
   {
       try
       {
         throw  new LowBalException();//creating an object of it
       }
       catch( LowBalException e)
       {
         System.out.println(e);
       }
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



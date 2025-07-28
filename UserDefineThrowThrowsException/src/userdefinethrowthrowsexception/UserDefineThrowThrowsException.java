/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userdefinethrowthrowsexception;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "negative input is not allowed";
    }
}

public class UserDefineThrowThrowsException {
    
    static int meth3(int l, int b)throws  NegativeDimensionException
    {
        if(l<0||b<0)
            
         throw new NegativeDimensionException();
       return l*b; 
    }
    
    static void meth2()throws  NegativeDimensionException
    {
       
        meth3(10,-20);
    }
    static void meth1()
    {
         try
        {
          meth2();
        }
         catch(NegativeDimensionException e )
         {
             System.out.println(e.toString());
         }
       
    }
    public static void main(String[] args)
    {
        meth1();
      
    }
    
}

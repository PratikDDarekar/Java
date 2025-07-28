/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgthrow.throwsexception;


public class ThrowThrowsException {
    
    
    static int meth3(int a, int b)throws Exception
    {
     if(a<0||b<0)       
        throw new Exception(); 
      return a*b; 
    }
      static void meth2()throws Exception
    {
         System.out.println(meth3(30,-10));
    }
    static void meth1()throws Exception
    {
         meth2();
    }
    
    public static void main(String[] args) {
      
     try{   
      meth1();
     }
     catch(Exception e)
     {
       System.out.println("negative input not allowed");
     }
    }
    
}

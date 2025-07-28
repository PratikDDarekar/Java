/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallyblock;
//
//public class FinallyBlock {
//
//    static void meth1() throws Exception
//    {
//        try
//        {
//            throw new Exception();
//        }
//        finally
//        {
//            System.out.println("finally block executed");
//        }
//    }
//    
//
//    public static void main(String[] args)  throws Exception
//    {
//        meth1();
//    }  
//}






public class FinallyBlock {

    static void meth1() throws Exception
    {
        try
        {
          System.out.println(1/0);                       //throw new Exception();
        }
        catch(ArithmeticException e)
        {
              System.out.println(e);   
        }        
        finally
        {
            System.out.println("finally block executed");
        }
    }
    

    public static void main(String[] args)  throws Exception
    {
        meth1();
    }  
}

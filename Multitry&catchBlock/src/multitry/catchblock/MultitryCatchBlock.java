/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multitry.catchblock;


public class MultitryCatchBlock {

    public static void main(String[] args) {
       
//       int A[]={30,20,10,40,0};
//       int c;
      
//       try{
//         c = A[0]/A[2];
//           System.out.println(c);
//           System.out.println(A[5]);
//       }
//       catch(ArithmeticException e)
//       {
//          System.out.println("bad input type"+e);
//       }
//        catch(ArrayIndexOutOfBoundsException e)
//       {
//          System.out.println("bad input type"+e);
//       } 
                
                //OR
                
   try             
   { 
     int A[]={30,20,10,40,0};
     int c;
       
          try
          {
           c = A[0]/A[4];
           System.out.println(c);
          }
          catch(ArithmeticException e)
           {
            System.out.println("bad input type"+e);
           }
          
      System.out.println(A[5]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {   
       System.out.println("bad input type"+e);
    } 
  }  
}
 
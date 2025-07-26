/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticblock;


//public class StaticBlock {
//
//    static
//    {
//        System.out.println("Block1");
//    }
//   
//    public static void main(String[] args) {
//          System.out.println("Main Block");
//    }
//    
//    static
//    {
//        System.out.println("Block2");
//    }
//}


class StaticBlock2 {

    static
    {
        System.out.println("Block1");
    }    
    static
    {
        System.out.println("Block2");
    }
}

class Test
{
      public static void main(String[] args) 
      {
         StaticBlock2 sb = new StaticBlock2();  
         System.out.println("Main Block");
         StaticBlock2 sb2 = new StaticBlock2();  
      }
}
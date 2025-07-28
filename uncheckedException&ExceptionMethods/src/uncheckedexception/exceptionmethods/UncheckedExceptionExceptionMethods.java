/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uncheckedexception.exceptionmethods;


//unchecked Exception

//
// class unCheckedException {
//
//   static void fun1()
//   {
//       System.out.println(10/0);
//   }
//   static void fun2()
//   {
//       fun1();
//   }
//   static void fun3()
//   {
//       fun2();
//   }        
//    public static void main(String[] args) {
//       fun3();
//    }   
//}



//unchecked Exception using try & catch block
//and using getMessage()

// class CheckedException  {
//
//   static void fun1()
//   {
//       try
//       {
//         System.out.println(10/0);
//       }
//       catch(Exception e)
//       {
//          System.out.println(e.getMessage());
//       }
//   }
//   static void fun2()
//   {
//       fun1();
//   }
//   static void fun3()
//   {
//       fun2();
//   }        
//    public static void main(String[] args) {
//       fun3();
//    }   
//}




//using printStackTrace()

class CheckedException  {

   static void fun1()
   {
       try
       {
         System.out.println(10/0);
       }
       catch(Exception e)
       {
          e.printStackTrace();//no need of System.out.println() it prints automatically
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

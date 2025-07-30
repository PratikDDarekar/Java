/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runnableinterface;


//method/way 1
//
//class ThreadInterface implements Runnable
//{
//    public void run()
//    {
//        int i=0;
//        while(true)
//        {
//            System.out.println(i++ +"hello");         
//        }
//    }
//}
//
//public class RunnableInterface {
// 
//    public static void main(String[] args) {
//        
//        ThreadInterface m = new ThreadInterface();
//        Thread th = new Thread(m);
//        th.start();
//        
//        int i=0;
//        while(true)
//         System.out.println(i++ +"world");            
//    }    
//}

//method/way 2
public class RunnableInterface implements Runnable {
    
     public void run()
    {
        int i=0;
        while(true)
         System.out.println(i++ +"hello");         
    }
 
    public static void main(String[] args) {
        
       RunnableInterface m = new RunnableInterface();// see this
        Thread th = new Thread(m);//see this
        th.start();
        
        int i=0;
        while(true)
         System.out.println(i++ +"world");            
    }    
}

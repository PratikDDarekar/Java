
package threadclass;


//method/way1
//
//class ThreadTest extends Thread
//{
//    public void run()
//    {
//        int i=0;
//        while(true)
//        {
//            System.out.println(i+"hello");
//            i++;
//        }        
//    }    
//}
//public class ThreadClass {
// 
//    public static void main(String[] args) {
//      
//         ThreadTest t = new  ThreadTest();
//         t.start();
//         
//        int i=0;
//        while(true)
//        {
//            System.out.println(i+"World");
//            i++;
//        }          
//    }    
//}




//method/way1

public class ThreadClass extends Thread {
 
    
    public void run()
    {
        int i=0;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }        
    }    
    
    public static void main(String[] args) {
      
         ThreadClass t = new  ThreadClass();
         t.start();
         
        int i=0;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }          
    }    
}
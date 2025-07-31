
package yieldmethodofthread;

class MyThread extends Thread
 {    //constructor   
 
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +"Mythread");
        }
    }
}


public class YieldMethodOfThread {

   
    public static void main(String[] args) {
       
        MyThread my = new MyThread();
        my.start();//don't forgot to start
        
        /*Thread.setPriority(6);// no static method make 
        reference for main method eg:-
        Thread mainThread = Thread.currentThread();  
        mainThread.setPriority(8);*/
        
        
        int count=1;
        while(true)
        {
            System.out.println(count++ +"main thread");
           Thread.yield();//it is a static ethod so can call with classname
           //give time for lower priority thread to run for some more time(check the book)
        }
    }
    
}

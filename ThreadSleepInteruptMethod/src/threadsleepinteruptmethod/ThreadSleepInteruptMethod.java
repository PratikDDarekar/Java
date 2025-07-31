
package threadsleepinteruptmethod;
import java.lang.String;

class MyThread extends Thread
{
    public  MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
    int count=1;
    while(true)
    {
    System.out.println(count++);
    
    try
    {
        Thread.sleep(1000);//sleep is static method so we can call it with the classname as reference
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
        
    }   
    }
    }
}


public class ThreadSleepInteruptMethod {


    public static void main(String[] args) {
        
        MyThread my = new MyThread("Thread1");
        my.start();
    //  my.sleep(10);
        my.interrupt();
    }
    
}

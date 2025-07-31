
package setdaeonmethod;
//its DaemonThread


class MyThread extends Thread
 {    //constructor   
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
        }
    }
}

public class SetDaeonMethod {

 
    public static void main(String[] args) {
      
         MyThread my = new  MyThread("thread1");
         my.setDaemon(true);//we set the MyThread class as a daemon thread although we could directly write it inside the constructor
         my.start();
         try{  Thread.sleep(1); }catch(InterruptedException e){} //sleep is for main method   
    }
    
}

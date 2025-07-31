
package threadconstructor;


class MyThread extends Thread
{
    //Constructor
    public MyThread(String str)
    {
       super(str);//constructor for the thread name 
       setPriority(Thread.MAX_PRIORITY);  //setting the priority for the Thread using setter ethod y taking the reference of the classname Thread inside constructor
    }
}

public class Threadconstructor { 
    public static void main(String[] args) {
            
        MyThread mt = new MyThread ("Mythread1");//thread constructor name
        
         System.out.println("getState = "+mt.getState() );
        
         mt.start();
        System.out.println("getpriority = "+mt.getPriority()  );
         mt.setPriority(Thread.MAX_PRIORITY-3);//usually we set the priority like this in this way
        System.out.println("getpriority = "+mt.getPriority()  );
        System.out.println("getState = "+mt.getState() );
        System.out.println("isalive = "+mt.isAlive()  );
        System.out.println("getState = "+mt.getState() );
        System.out.println("isdaemon = "+mt.isDaemon()  );
        System.out.println("isInterrupted = "+mt.interrupted()  );//isInterrupted
        System.out.println("getid = "+mt.getId()  );
        System.out.println("getname = "+mt.getName()  );
         mt.setName("Threadexpress");
        System.out.println("getname = "+mt.getName()  );
         mt.setDaemon(true);
        System.out.println("isdaemon = "+mt.isDaemon()  );
        System.out.println("getpriority = "+mt.getPriority()  );
         mt.setPriority(8);
        System.out.println("getpriority = "+mt.getPriority()  );
         mt.interrupt();
        System.out.println("isInterrupted = "+mt.isInterrupted()  );
        System.out.println("activeCount = "+mt.activeCount() );
        System.out.println("activeCount = "+mt.currentThread() );
         mt.dumpStack() ;
        System.out.println("getState = "+mt.getState().NEW );//important
                          
    }
    
}


package joinmethodinthread;


class MyThread extends Thread
 {    //constructor   
   public  MyThread(String name)
    {
        super(name);
    }
   
    public void run()//overriden method
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}



public class JoinMethodInThread {

    
    public static void main(String[] args) {
        
         MyThread my = new  MyThread("thread1");
         my.setDaemon(true);//we set the MyThread class as a daemon thread although we could directly write it inside the constructor
         my.start();
         
         //Thread.join(); 
         
         /* join() is non static therefore we cant call it just by using the class
          name and here we want to make the main class thtread to join 
          the MyThread class therefore here we need to take the reference
          of the Main class but we don't have its reference therefore we need 
          to make the reference for the thread class by using this :-
         */
         Thread mainThread = Thread.currentThread();//as current thread method is a static method therefore we can use it with class name as a reference
         try{
          mainThread.join();//join method non parameterize
         //mainThread.join(10);//join method parameterize
         }
         catch(InterruptedException e){}
         
    }
    
}

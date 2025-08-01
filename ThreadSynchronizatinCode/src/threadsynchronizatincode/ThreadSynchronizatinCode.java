
package threadsynchronizatincode;

// WITHOUT SYNCHRONIZATION/ MONITOR


/*class  MyData
{
     void display(String str)
    {
      for(int i = 0;i<str.length();i++)
      {
          System.out.print(str.charAt(i));
      } 
    }
} */


// METHOD-1/ WAY-1 SYNCHRONIZATION/ MONITOR

/*class  MyData
{
     void display(String str)
    {
  synchronized(this)
  {
      for(int i = 0;i<str.length();i++)
      {
          System.out.print(str.charAt(i));
      }     
  }
    }
} */

// METHOD-1/ WAY-1 SYNCHRONIZATION/ MONITOR

/*class  MyData
{
    synchronized void display(String str)
    {
      for(int i = 0;i<str.length();i++)
      {
          System.out.print(str.charAt(i));
      } 
    }
} */


// METHOD-1/ WAY-1 SYNCHRONIZATION/ MONITOR USING sleep() METHOD EXPLANATION IS IN THE BOOK AT THE END OF THIS CODE

class  MyData
{
    synchronized void display(String str)
    {
      for(int i = 0;i<str.length();i++)
      {
          System.out.print(str.charAt(i));
          
           try{ Thread.sleep(100); } catch(Exception e){}
      } 
    }
} 


class MyThread1 extends Thread
{
    MyData d;
    
    MyThread1(MyData d){this.d=d;}
    
    public void run()
    {
        d.display("Hello World");
        //or
        // MyData d new Mydata(); but than this should be made in the top
        //d.display("Hello World");
    }
}

class MyThread2 extends Thread
{
    MyData d;
    
    MyThread2(MyData d){this.d=d;}
    
    public void run()
    {
        d.display(" Welcome ");
        //or
        // MyData d new Mydata(); but than this should be made in the top
        //d.display("Hello World");
    }
}


public class ThreadSynchronizatinCode {
    public static void main(String[] args) {  
        
        MyData d = new MyData();
        
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        
        t1.start();
        t2.start();
    }    
}

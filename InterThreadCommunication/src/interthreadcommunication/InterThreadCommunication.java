
package interthreadcommunication;


class MyData{
int value=0;

boolean flag=true;

synchronized void set(int v)
{
    while(flag!=true)
    {
       try{ wait();}catch(Exception e){}
    }
    
    value=v;
    flag = false;
    notify();     
}

synchronized int get()
{
    int x =0;
    while(flag!=false)
    {
        try{ wait();}catch(Exception e){}
    }
    
    x=value;
    flag = true;
    notify(); 

return x;    
}
}


class Producer extends Thread
{
 MyData d;
 
 Producer(MyData dat)
 {
     this.d=dat;
 }
 
 public void run()
 {
      int i=1;
     while(true)
     {
         d.set(i);
         System.out.println("Producer : "+i);
         i++;
     }
 }   
}

class Consumer extends Thread
{
    MyData d;
    
    Consumer(  MyData d){this.d=d;}
    
    public void run()
    {
        System.out.println("Consumer :"+ d.get());
    }
} 

public class InterThreadCommunication {
 
    public static void main(String[] args) {
        
        MyData d = new MyData();
        
        Consumer c = new Consumer(d);
        Producer p = new Producer(d);
        
        p.start();
        c.start();        
    }  
}

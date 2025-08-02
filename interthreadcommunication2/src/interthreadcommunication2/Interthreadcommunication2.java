
package interthreadcommunication2;



class SharedObject
{
   int value=0;
   
   boolean flag=true;
   
  synchronized public void set(int v)
   {
       while(flag != true)
       {
       try{ wait(); }catch(Exception e){}
       }
       value=v;
       flag =false;
       notify();
   }
    
  synchronized  int get()
   {
       int x;
         while(flag != false)
       {
       try{ wait(); }catch(Exception e){}
       }
       
       x=value;
       flag = true;
       notify();       
       return x;
   } 
    
}

class Producer extends Thread
{
   SharedObject so;
   
    Producer(SharedObject so){ this.so=so;}
    
  public void run()
  {
     int i=1;
    while(true)
    {
        System.out.println("Producer : "+i);
        so.set(i);
        i++;
      
    }
  } 
}


class Consumer extends Thread
{
    SharedObject so;
    
    Consumer(SharedObject so){this.so=so;}
    
    public void run()
    {
        int i=0;
        while(true)
        {
        System.out.println("Consumer : "+ so.get());
        i++;
        }
    }
}



public class Interthreadcommunication2 {
  public static void main(String[] args) {
      
      SharedObject so= new  SharedObject();
      
      Producer p = new Producer(so);
      Consumer c = new Consumer(so);
      
      p.start();
      c.start(); 
      
      
    }
}

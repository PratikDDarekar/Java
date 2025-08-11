
package pipedstreamclass;

import java.io.*;

class Producer extends Thread
{
    OutputStream os;
    
    public Producer(OutputStream s){os=s;}
    
    public void run()
    {
        int count=1;
        
        while(true)
        {
            try{
            os.write(count++);
            count++;
            os.flush();
           
            System.out.println("Producer "+count);//this is written by the producer on outputStream
            try{Thread.sleep(10);}catch(Exception e){}//for synchronizing or working alternately
            }
            catch(Exception e){}
        }
    }
}


class Consumer extends Thread
{
    InputStream is;
    
    public Consumer(InputStream s){is=s;}
    
    public void run()
    {
        int x;
        
        while(true)
        {
            try{
            x=is.read();
                       
            System.out.println("Consuer "+x);//this is written by the consumer on InputStream
            System.out.flush();//for synchronizing or working alternately
            try{Thread.sleep(10);}catch(Exception e){}
            }
            catch(Exception e){}
        }
    }
}

public class PipedStreamClass {

    public static void main(String[] args)throws Exception
    {
       
        PipedInputStream pis = new PipedInputStream();
         PipedOutputStream pos = new PipedOutputStream();
         
         pos.connect(pis);//connecting both the pipes of producer and consumer inside the main method
         
         Producer p= new Producer(pos);
         Consumer c = new Consumer(pis);
         
         p.start();
         c.start();
    }
    
}

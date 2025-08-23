//all the comments are same as in the previous class and just wrote comments here for the threads
package multithreadedreverseechoserver;
import java.net.*;
import java.io.*;

//server Class
public class MultiThreadedReverseEchoServer extends Thread//extending a thread
{
    Socket stk;//creating socket
    
    //should have a constructor which should accept socket
    public  MultiThreadedReverseEchoServer(Socket st)
    {
        stk=st;       
    }
    
    //getting stream from socket connection that is inputStream and OutputStream
    public void run()//overridden method
    {
        try{//exception handling
        BufferedReader br= new   BufferedReader(new InputStreamReader(stk.getInputStream()));     
        PrintStream ps = new PrintStream(stk.getOutputStream());
               
        String msg;
        StringBuilder sb;
        do
        {      
            msg=br.readLine();
           
            sb= new StringBuilder(msg);
            sb.reverse();            
            msg=sb.toString();      
            ps.println(msg);
                 
        } while(!msg.equals("dne"));
        
        stk.close();
        }catch(Exception e){}
    }
    
    
    public static void main(String[] args) throws Exception
    {   //creating a server socket
        ServerSocket ss = new  ServerSocket(2000);
        System.out.println("Server has started...");
        Socket stk;
        MultiThreadedReverseEchoServer re;//creating obj reference
         int count=1;
        do{
            
         stk=ss.accept();//acepting multiple connections
         //when lient connects it should create an object of the threads
        
         System.out.println("Client get connected"+ count++);
         re=new MultiThreadedReverseEchoServer(stk);//creating the new object and it should send a socket to it
         
         
        }while(true);//server running infinitely  
       
       //here we no need to close the server socket because the line will never reach uptill here because we make it infinite loop
    }   
}




 
//Client class (i copy pasted the code here )
class Client 
{ 
    public static void main(String[] args)throws Exception
    {   
      
        Socket stk = new  Socket("Socket ss = new  Socket(\"192.168.1.5",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));        
        BufferedReader br= new   BufferedReader(new InputStreamReader(stk.getInputStream()));        
        PrintStream ps = new PrintStream(stk.getOutputStream());
       
        String msg;
        
        do
        {        
            msg=keyb.readLine();                     
            ps.println(msg);                   
            msg=br.readLine();
            System.out.println("From server to client:- "+msg);
                 
        } while(!msg.equals("dne"));
        stk.close();   
    }
}

//i will just compile it by saying (clean build a project ) from run button so it will clean the previous content and build a project

//now i willrun the program in command prompt because i have to run 2 things
//steps to run
//enter into reverseecho folder
//dir
//go in build folder:- cd build
//cd classes folder
//there u will find the reverse echo package build than
//run it by:- java packagename.classname eg:-  reverseechoserver.ReverseEchoServer 
//
//than here  server will get start and it will be waiting for the client program 
//than go and open the new command prompt and do the same process again
//
//        than both will be ready and from client type any msg and press entered you will get response from the server
//you will not see any activity from the server command prompt because it is not giving any msg

//FOR MULTIPLE CLIENT YOU NEED TO OPEN THE MULTIPLE COMMAND PROMPT

//OR CREATE A SEPARATE FILE FOR SERVER AND THE CLIENT AND THAN COMPILE IT IT WILL WORK
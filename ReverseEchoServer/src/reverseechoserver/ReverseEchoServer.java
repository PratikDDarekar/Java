//install java 22 than use 2 different command prompt to run the program
package reverseechoserver;

import java.net.*;
import java.io.*;

//Server class
public class ReverseEchoServer 
{ 
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss = new  ServerSocket(2000);
        //we are taking it in the reference of socket
        Socket stk=ss.accept();//now when the client connects this accept method will accept the connection and it will attached it with the socket stk when i have to comunicate with the client than i have to use this sok=cket reference, here the server is just accepting the connection to the socket of client
        
        //now for the socket i need the inputstream and the outputstream so that i could read the input from the client and reverse it and than send it
       
         //for reading take the bufferedReader(actually we are getting a inputStream but this buffered cannot read the Stream becausr reader belongs to reader writter stream which is the character based stream but we are getting the bit stream so for that we need a convertor which is InputStreamReader so from where do we want the strean? from the socket stk
        
        //from a socket get inputstream convert a inputStream into the reader by usin a class called InputStreamReader and from that inputstreamreader we are giving it to the bufferedinput strea so that we are giving the complete line from the client
        BufferedReader br= new   BufferedReader(new InputStreamReader(stk.getInputStream()));
        
        //nmow i need the output stream so that i could print the output to the client for that take PrintStream and give it the output Stream from the socket
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        //now what a server shouls do? so it should read a msg from the client so we are taking a string toread the msg from the client and reversing it and sending it back we will do it in the loop todoit repeatedly
        String msg;
          StringBuilder sb;//taking the reference of the same/single object inside the loop
        do
        {
            //read from the inputStream from the socket
            msg=br.readLine();
            //now for reversing the msg method is present in the stringbuilder so than we will convert a string into the strinbuilder object, we are doing this because string class is not having a method for reversing a string
             sb= new StringBuilder(msg);
            sb.reverse();//reversing
            //now i should get the msg in string form so that this
            msg=sb.toString();
            //now it Should write back into the socket line for writting
            ps.println(msg);
            
            //how long should this loop run uptill user doesn't say end in server which will be in the reverse dne            
        } while(!msg.equals("dne"));
   
    }
}




 //client class so instead of making the separate project i will write it down in the same program
//Client class (i copy pasted the code here )
class Client 
{ 
    public static void main(String[] args)throws Exception
    {   
        //not server socket only socket and socket requires ip address and port both
        //Socket ss = new  Socket("localhost",2000);//OR
        Socket stk = new  Socket("Socket ss = new  Socket(\"192.168.1.5",2000);
        
        
      
        //now for the socket i need the inputstream and the outputstream so that i could read the input from the client and reverse it and than send it
       
         //for reading take the bufferedReader(actually we are getting a inputStream but this buffered cannot read the Stream becausr reader belongs to reader writter stream which is the character based stream but we are getting the bit stream so for that we need a convertor which is InputStreamReader so from where do we want the strean? from the socket stk
        //to read from the keyboard
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in)); 
        //from a socket get inputstream convert a inputStream into the reader by usin a class called InputStreamReader and from that inputstreamreader we are giving it to the bufferedinput strea so that we are giving the complete line from the server
        BufferedReader br= new   BufferedReader(new InputStreamReader(stk.getInputStream()));        
        //now i need the output stream so that i could print the output to the server for that take PrintStream and give it the output Stream from the socket
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        //now what a server shouls do? so it should read a msg from the client so we are taking a string toread the msg from the client and reversing it and sending it back we will do it in the loop todoit repeatedly
        String msg;
        
        do
        {
            //read from the inputStream from the keyboard
            msg=keyb.readLine();
            
            
            //now it Should write back into the socket line for writting
            //send it to the server, print a msg from outputstream from ps to a server
            ps.println(msg);
            
            //read a msg from the server
            msg=br.readLine();
            System.out.println("From server to client:- "+msg);
            
            //how long should this loop run uptill user doesn't say end in server which will be in the reverse dne            
        } while(!msg.equals("dne"));
        stk.close();//very important to close the socket after using it
   
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


//OR CREATE A SEPARATE FILE FOR SERVER AND THE CLIENT AND THAN COMPILE IT IT WILL WORK
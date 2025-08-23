
package datagramcommunicationsenderreceiverclientserver;
import java.net.*;//import package

//Client
public class DatagramCommunicationSenderReceiverClientServer 
{
    public static void main(String[] args) throws Exception//handle exception
    {
        //SEND THE DATA
        //client ha stocreate the DatageamSocket so that to communication can done with this one
        //client requires a port no. for receiving the data
        //just a DAtaGramSocket was sufficiant if the client was not receivig any data
        DatagramSocket ds=new DatagramSocket(2001);
        //sending the msg
        String msg="Hello World";
        //now using this msg i have to create a new datagrampacket object here we requires a array of bytes that you want to send using datagram packets by using msg.getbytes() you will get all the bytes this a method inside a string class and next thing i must mention whatis the length of the msg by using msg.length()and next to whom i want to send i should mention the IP Address so for getting the ip address we use InetAdress.getByName("localhost")because on same machine we have to run and than port number
        //PARAMETER:-arraysOfBytes you want to send in packets, what is the lengthof the arrayof bytes that is msg,  than what's the ipaddress you want to send and than the portno.
        DatagramPacket dp=new DatagramPacket( msg.getBytes(), msg.length(),InetAddress.getByName("localhost"),2000);
        //sending a packet to the server using the socket
        ds.send(dp);
        
        
        //CREATE A NEW PACKAGE AND RECEIVE THE DATA
        //array of bytes so that we couldreceive a data init abd taking a bigger size because we don't know how many bytes are coming from there
        byte b[]=new byte[1024];
        //for receing a packet creating a new packet
                           //name,length
        dp=new DatagramPacket(b,1024);
        //using datagram soket we are receving datagram packets
        ds.receive(dp);
        
        //USING A DATA FROM THE DATAGRAM PACKAGE CREATE A MESSAGE STRING AND DISPLAY IT
        //msg assign new string from the datagrampacket i will call the method getData() which will give arrays of bytes and using trim to reduce the empty spaces 
        msg=new String(dp.getData()).trim();
        
        System.out.println("From Server "+msg);
        
        ds.close();//closing the datagramSocket
        
    }   
}

//Server
 class Server 
{
    public static void main(String[] args) throws Exception
    {
        //Server should have the datagram socket and 2000 is the port no. for it
        DatagramSocket ds=new DatagramSocket(2000);
        
         //CREATE A NEW PACKAGE AND RECEIVE THE DATA
         //receiving the datagram packet
        byte b[]=new byte[1024];
        //Creating a DAtagramPacket
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        
        //CREATING A STRING AND REVERCEING IT
        //I'm getting a string out of it
        String msg=new String(dp.getData()).trim();        
        System.out.println("From Client "+msg);
        //creating a stringbuilder foir reverceing a string
        StringBuilder sb=new StringBuilder(msg);
        sb.reverse();
        //get back the reverced string from the stringbuilder
        msg=sb.toString();
        
        //creating a datagrampacket for sending the msg to the client so i also should mention the ip address and portno. , creating it with the help of the reference onlyfor sending
        dp=new DatagramPacket( msg.getBytes(), msg.length(),InetAddress.getByName("localhost"),2001);
        //sending the msg from socket to the packet
        ds.send(dp);
           
        ds.close();//closin the socket
        
    }   
}


package studentchallengeserialization2;
import java.io.*;



class Customer implements Serializable
{
    String custID;
    String name;
    String phno;
    
    static int count = 1;//counter
    
    Customer(String n, String p)
    {
      custID="C"+count;
      count++;
      name=n;
      phno=p;
    }
    
    public String toString()
    {
        return "Customer ID:"+custID+"\nName :"+name+"\nPhoneNo.:"+phno+"\n";
    }
}

public class Studentchallengeserialization2 {

   /* 
    public static void main(String[] args)throws Exception 
    {
        
       Customer list[]={new Customer("Smith","7586213846"), new Customer("John","8986213846"), new Customer("Ajay","9686213878")};
        
        FileOutputStream fos=new FileOutputStream("Customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeInt(list.length);//how many objects are there in a array
        for(Customer c:list)
            oos.writeObject(c);//storing all the objects
        oos.close();
        fos.close();
    }
*/
    
     public static void main(String[] args)throws Exception 
     {
         java.util.Scanner sc=new java.util.Scanner(System.in);//taken objof a scanner to read the data from the output
         
         FileInputStream fis=new FileInputStream("Customer.txt");
         ObjectInputStream ois=new  ObjectInputStream(fis);//for reading thr objs from the file
         
         int length=ois.readInt();//reading the number of objects length
         
         Customer list[]=new Customer[length];
         
         for(int i=0;i<length;i++)//this will read allt he customer from the file
         {
             list[i]=(Customer)ois.readObject();//reading from objectInputStram by calling readobject() method and typecating it to Customer
         }   
             System.out.println("Enter Name of Customer");//asking the name of the customer
             String name=sc.nextLine();
             
             for(int j=0;j<length;j++)
             {
                 if(name.equalsIgnoreCase(list[j].name))//searching the name of the customer of that particular name and printing it
                     System.out.println(list[j]);
             }
             
             ois.close();
             fis.close();
         
     }
    
    
    
}

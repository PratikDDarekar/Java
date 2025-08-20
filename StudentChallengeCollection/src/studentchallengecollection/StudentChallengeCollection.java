
package studentchallengecollection;



import java.io.*;
import java.util.*;

class Account implements Serializable // to achieve serialiablr
{
    String accno;
    String name;
    double balance;
    
    Account(){}//default constructor for serialization
    
    Account(String a,String n,double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}



public class StudentChallengeCollection {


    public static void main(String[] args)throws Exception
    {
   
        
            Scanner sc=new Scanner(System.in);//for searching key for the account number from the keyboard
        
        Account acc=null;//reference of account whenerver needed i will use it
                //key   value
        HashMap<String,Account> hm=new HashMap<>();
        
       //whenever the application is opening it should bring all the contains from the file and store it in hashmap
        try
        {
        FileInputStream fis=new FileInputStream("Accounts.txt");//taking input (serialization)
        ObjectInputStream ois=new ObjectInputStream(fis);//(serialization)
        
        
        int count=ois.readInt();//readding how many accounts are there in the file
        for(int i=0;i<count;i++)//readding those accounts
        {
            acc=(Account)ois.readObject();
            System.out.println(acc);
            hm.put(acc.accno,acc);//putting it into hashmap
        }
        fis.close();//closing file inputStream and ObjectInputStream
        ois.close();
        
        }
        catch(Exception e)
        {
            
        }
        
        
        
        FileOutputStream fos=new FileOutputStream("Accounts.txt");//opening file
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        //declaring some temporary variable
        int choice;
        String accno,name;
        double balance;
        
        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice ");
            choice=sc.nextInt();//reding the choice from the keyboard using scanner
            
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");//ignore any new line character or carrage returns 
            
            switch(choice)
            {           //asking details and creating account and putting it into the hashmap and displaying msg
                case 1: System.out.println("Enter Details Accno, Name ,balance ");
                        accno=sc.nextLine();
                        name=sc.nextLine();
                        balance=sc.nextDouble();
                        acc=new Account(accno,name,balance);
                        hm.put(accno, acc);
                        System.out.println("Account Created for "+name);

                        break;
                        
                        //from hash map removing the particular entry
                case 2: System.out.println("Enter Accno");
                       
                        accno=sc.nextLine();
                        hm.remove(accno);
                        break;
                        
                        //taking the accno. and getting the details from the hashmap and displaying them
                case 3: System.out.println("Enter Accno");
                        accno=sc.nextLine();
                        acc=hm.get(accno);
                        System.out.println(acc);
                        break;
                case 4://displaying all the accounts details
                        for(Account a:hm.values())
                            System.out.println(a);
                        break;
                        
                case 5://5th and 6th both are same saving all this object from the hashmap into a file using object output stream 
                case 6: oos.writeInt(hm.size());//writing the size of the hashmap total how many objects are there
                
                        for(Account a:hm.values()) //writting all the objects using for each loop
                            oos.writeObject(a);
                        
            }
            
        }while(choice!=6);
        oos.flush();
        oos.close();

        fos.close();
    }
    
}

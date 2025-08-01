
package studentchallengethreadsynchronizatincode;
//this code is by me 

class AtMmachine
{     
   synchronized void checkBalance(String name,int balance)
    {
        System.out.print(name +" your balance is ");
         try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("   "+balance);
    }
    
    synchronized void withdraw(String name, int amount, int balance)
    {
       System.out.print(name +" your withdraw this much amount : "+amount); 
        try{Thread.sleep(1000);}catch(Exception e){}
       System.out.println("  and your remaining balance is : "+ (balance-amount));
    }   
}

class Threadp1 extends Thread
{
    AtMmachine atm;
    String name;
    int amount;
    int balance ;
    
     public Threadp1(AtMmachine atm, String name, int amount, int balance)
     { 
         this.atm=atm;
         this.name=name; 
         this.amount=amount; 
         this.balance=balance;
     }  
    
     void useATM()
    {  
     atm.checkBalance(name, balance);
     atm.withdraw(name, amount,balance);
    }
     
    public void run()
    {
      useATM();
    }
   
}

class Threadp2 extends Thread
{
    AtMmachine atm;
    String name;
    int amount;
    int balance ;
    
       public Threadp2(AtMmachine atm, String name, int amount, int balance)
     { 
         this.atm=atm;
         this.name=name; 
         this.amount=amount; 
         this.balance=balance;
     }  
           void useATM()
    {  
     atm.checkBalance(name, balance);
     atm.withdraw(name, amount,balance);
    }
     
    public void run()
    {
      useATM();
    }
}

public class StudentChallengethreadSynchronizatincode {
  
    public static void main(String[] args) { 
        
        AtMmachine atm = new AtMmachine();
        
        Threadp2 t1 = new Threadp2(atm,"Pratik",250,1000000);     
        Threadp2 t2 = new Threadp2(atm,"Rutik",680,120000);
        
         t1.start();
         t2.start();
        
        
    }  
}

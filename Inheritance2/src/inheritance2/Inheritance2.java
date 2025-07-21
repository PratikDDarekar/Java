
package inheritance2;

//public class Inheritance2{}
class Account1
{
    private String accNo;
    private String name;
    private String address;
    private int phno;
    private String dob;
    protected long balance;
    
 public Account1(String accNo, String name, String address, int phno, String dob)
 {
     this.accNo=accNo;
     this.name= name;
     this.address=address;
     this.phno=phno;
     this.dob=dob;
     balance=0;
 }   

public String getAccN(){ return accNo;}
public String getName(){ return name;}
public String getAddress(){ return address;}
public int getPhno(){ return phno;}
public String getDOB(){ return dob;}

public void setAddress(String address)
{
    this.address=address;
}
public void setPhno(int phno)
{
    this.phno=phno;
}

 public String toString()
 {
     return " accNo = "+accNo+",\n name = "+name+",\n  address = "+address+",\n  phno = "+phno+",\n  dob = "+dob+ "\n  balance = "+balance;
 }
}   


class SavingAccount extends Account1
{

    public SavingAccount(String accNo, String name, String address, int phno, String dob) {
        super(accNo, name, address, phno, dob);
    }
//    private int amt;
//    public SavingAccount(int amt)
//    {
//        this.amt=amt;
//    }
    public void deposit(long amt)
    {
        balance += amt;
    }
       public void withDraw(long amt)
    {
        balance -= amt;
    }
}

class LoanAccount extends SavingAccount
{

    public LoanAccount(String accNo, String name, String address, int phno, String dob) {
        super(accNo, name, address, phno, dob);
    }
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
    
   
}

class Test
{
    public static void main(String []args)
    {
        SavingAccount sa=new SavingAccount("678vv","Divyesh","Dhule",960488895,"1999");
        
        sa.deposit(1000);
        sa.withDraw(250);
        System.out.println(sa.balance);
        System.out.println(sa);
        
        System.out.println();
        
        LoanAccount la =new LoanAccount("678gg","Pranav","Nashik",867452135,"2003");
         la.deposit(1000);
         la.payEMI(200);
         la.repay(800);
          System.out.println(la.balance);
           System.out.println(la);
    }
}


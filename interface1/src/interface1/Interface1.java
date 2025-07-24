/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface1;

interface Member
{
    void callBack();
}

class Customer implements Member
{
    String name;
    
    Customer(String n)
    {
        name=n;
    }
    
    public void callBack()
    {
        System.out.println("yes! i am coming " +name);
    }
}

class Store
{
    Member mem[] = new Member[100];
    int count=0;
    
    void register(Member m)
    {
        mem[count++]=m;    
    }
    
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callBack();
        }
    }
}


class Test
{
    public static void main(String[] args)
    {
        Store s = new Store();
        Customer c1 = new Customer("john");
        Customer c2 = new Customer("Smith");
        
         s.register(c1);
         s.register(c2);
          
         s.inviteSale();
    }
}


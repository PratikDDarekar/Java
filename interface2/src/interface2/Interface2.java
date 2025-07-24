/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface2;



interface Member
{
    void callBack();
}

class Store
{
    Member mem[] = new Member[10];
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

class Customer implements Member
{
    String name;
    
    Customer(String name)
    {
        this.name= name;
    }
    
    @Override 
    public void callBack()
    {
        System.out.println("yes! i will be there "+name);
    }
}

class test1
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("pratik1");
        Customer c2 = new Customer("karti2k");
        Customer c3 = new Customer("kartik3");
        Customer c4 = new Customer("kartik4");
        Customer c5 = new Customer("kartik5");
        Customer c6 = new Customer("kartik6");
        Customer c7 = new Customer("kartik7");
        Customer c8 = new Customer("kartik8");
        Customer c9 = new Customer("kartik9");
        Customer c10 = new Customer("kartik10");
        Customer c11 = new Customer("kartik11");
        Customer c12 = new Customer("kartik12");
        Customer c13 = new Customer("kartik13");
        
        Store s = new Store();
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.register(c4);
        s.register(c5);
        s.register(c6);
        s.register(c7);
        s.register(c8);
        s.register(c9);
        s.register(c10);
//        s.register(c11);
//        s.register(c12);
//        s.register(c13);
        
        s.inviteSale();
        
    }
}
    


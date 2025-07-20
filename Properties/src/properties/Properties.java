//This module contains practicing Constructor  and Properties intotal 3 main classess
package properties;

//EXAMPLE NO. 1
public class Properties {

    private double radius;
    private double height;

    //Constructors
    public Properties()//non-parameterize Constructor
    {
     radius =5;
     height = 20;    
    }
    public Properties(double r)//Parameterize constructor
    {
     radius =r;   
    }
    public Properties(double r, double h)//2Parameterize constructor
    {
     radius =r;
     height =h;
    }
    //Properties
    public double getRadius()
    {
       return radius;
    }    
    public double getHeight()
    {
      return height;
    }    
    public void setRadius(double r)
    {
     radius=r;
    } 
    public void setHeight(double h)
    {
      height=h;
    } 
    //Methods
    public double lidArea()
    {
      return 2*Math.PI*radius*(radius+height);
    }
}



//EXAMPLE NO. 1 main class
class Cylinder
{
        public static void main(String[] args) {

        Properties p = new Properties();//non-parameterize constructor
       
        //Properties
        p.setRadius(4);
        p.setHeight(4);
        System.out.println(p.getRadius());
         System.out.println(p.getHeight());
        System.out.println(p.lidArea());
        
         Properties p1 = new Properties(5);//1Parameterize constructor
          System.out.println(p1.lidArea());
          
          Properties p2 = new Properties(5,10);//2Parameterize constructor
            System.out.println(p2.lidArea());
    }
}




//EXAMPLE NO. 2
class Product
{
   private  String itemno;
   private  String name;
   private  double price;
   private  int qty;
    
   //Constructor
   public Product(String ino)// Single-Parameterize Constructor
   {
     itemno = ino;  
   }
    public Product(String ino, int q)// 2-Parameterize Constructor
   {
         itemno = ino;  
         qty=q;
   }
      public Product(String ino, int q, String n)// 3-Parameterize Constructor
   {
         name= n;  
         itemno = ino;  
         qty=q;
   }  
   //Properties
    public void setPrice(int p)
   {
       price=p;
  }
    public void setQuantity(int q)
   {
       qty=q;
   }
    public String getItemNo()
    {
        return itemno;
    }   
    public int getQuantity()
    {
        return qty;
    }       
}

//EXAMPLE NO. 2 main class
class Products
{
  public static void main(String[] args)
  {
    Product pd= new Product("hyhknbh889u98989");
    Product pd1= new Product("9u98989",7);
    Product pd2= new Product("ggggfrdyhk9",3,"basketball");

     System.out.println(pd.getItemNo()+" ,"+pd.getQuantity());
     System.out.println(pd1.getItemNo()+" ,"+pd1.getQuantity());
     System.out.println(pd2.getItemNo()+" ,"+pd2.getQuantity());
}
}



//EXAMPLE NO. 3
 class Customer
 {
     private String custId;
     private String name;
     private String address;
     private long phno;
     
     //Properties
     public String getCustId()
     {
         return custId;
     }
       public String getname()
     {
         return name;
     }
         public long getphno()
     {
         return phno;
     }
         public String getAddress()
     {
         return address;
     }
           public void setAddress(String addr)
     {
         address = addr;
     }
           
     //Constructors      
     public Customer()//Default Constructor
     {
         custId ="000123";
         name = "Ram";
     }      
     public Customer(String cId, String nam)//Single parameterize Constructor
     {
         custId =cId;
          name = nam; 
     }  
       public Customer(String cId, String nam,String adr)//Double parameterize Constructor
     {
         custId =cId;
         name = nam; 
         address= adr;
     }   
       public Customer(String cId, String nam,String adr, long pno)//All(4) parameterize Constructor
     {
         custId =cId;
         name = nam;       
         address= adr;
         phno = pno;
     }
       
      //Methods         
       public String toString()
       {
           return "custid = "+custId +", name = "+name+ ", address = "+address +", phone number = "+phno;
       }                 
   }
     

    
//EXAMPLE NO. 3 main class
 class CustomerTest
 {
    public static void main(String []args)
    {
       
         Customer c = new Customer();//default constructor object
          c.setAddress("lucknow, Punjab, India");//properties
           System.out.println(c);
           
           System.out.println();
           
         Customer c1 = new Customer("50505","william");//Double args constructor object
          System.out.println(c1);
          
          System.out.println();
          
         Customer c2 = new Customer("12300","Ravi");//3 args constructor object But
//i set the address using setmethod therefore no need od passing the value for the addressarguement
          c2.setAddress("new york city wahington");//properties
           System.out.println(c2);
           
           System.out.println();
          
         Customer c3 = new Customer("10101","krishna","USA America",9604555985l);
         //4 args constructor object
          System.out.println(c3);
          
          System.out.println();
    }    
 }

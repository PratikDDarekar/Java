/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package properties;


public class Properties {

private double radius;
private double height;
  //  boolean getRadius;



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






    public double lidArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
}
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

class Product{

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
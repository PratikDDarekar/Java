
package paraconstinh5;


public class ParaConstInh5 {
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }   
}

class Rectangle
{
     int breadth;
     int length;
     
    public Rectangle()
    {
        length=breadth =1;
    }
       public Rectangle(int l,int b)
    {
        this.length = l;
        this.breadth = b;
        
    }
    
}
class Cuboid extends Rectangle
{
    int height;
    
    public Cuboid()
    {
        height = 1;
    }
     public Cuboid(int h)
    {
        height = h;
    }
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        height = h;
    }
    //method
    public int volume()
    {
        return breadth*length*height;
    }
}
class Test {
    public static void main(String[] args) {
        
        Cuboid cb = new Cuboid(10,20,30);
      //  cb.volume(10,20,30);
      System.out.println(cb.volume());
    }   
}
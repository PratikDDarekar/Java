
package statickeyword;


class StaticPractice
{
 static int x=10;
  int y=20;
  
  static void display()
  {
      System.out.println("x ="+x);
  }
  
  void show()
  {
      System.out.println("x="+x+", y="+y);
  } 
}

class Test
{
    public static void main(String[] args)
    {
         StaticPractice s = new  StaticPractice();
         s.show();
         s.display();
         
         s.x=70;
         s.y=100;
         
         
         StaticPractice s2 = new  StaticPractice();
         s2.show();  //you can see the value has been chande for y
         s2.display();

         System.out.println(StaticPractice.x);//calling static variable using static variable
         
          StaticPractice.display();//calling static method using static variable
    }
}

package staticinnerclasses;

//Static Inner Class

class Outer
{
    int x =5;
    static int y=6;
    
    static class My
    {
      public void view()
      {
       System.out.println(y+" = y");//in static we can't use non-static variable   
      } 
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Outer.My oi = new Outer.My();
        oi.view();
    }
}


package localinnerclass;


class Outer
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("hello");
            }
        }
      //Inner i = new Inner(); //by creating the references
      //i.show();
      
      //OR
      
      new Inner().show(); //without creating reference and there is no name to the object so this is an anonymous object
    }   
}
class Test
{
   public static void main(String[] args)
   {
        Outer o = new Outer();
        o.display();
   }            
}

package comparableinterface;
import java.util.*;


class Point implements Comparable
{
    int x;
    int y;
    
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public String toString()
    {
        return "x="+x+" y="+y;
    }
    
    public int compareTo(Object o)//para type should be object
    {
        Point p=(Point)o;//taking the reference and typecating o into it
        
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
            if(this.x<p.y)
            return -1;
        else if(this.y>p.y)
            return 1;
        else
            return 0;
        }
    }
}



public class ComparableInterface {

   
    public static void main(String[] args) {
        

    TreeSet<Point> ts=new TreeSet<>();//making the object of treeset in which we are giving generic value of a class for creating the object
      
     ts.add(new Point(1,1));
      
      ts.add(new Point(5,5));
       ts.add(new Point(5,2));

       System.out.println(ts);


    }
    
}

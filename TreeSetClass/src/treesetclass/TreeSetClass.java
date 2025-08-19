
package treesetclass;
import java.util.*;

public class TreeSetClass {

   
    public static void main(String[] args) {
      
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40,50,60));
      //  Collection<Integer> ts1=new TreeSet<>(List.of(10,20,30,40,50,60));
        //SortedSet<Integer> ts3=new TreeSet<>(List.of(10,20,30,40,50,60));
        
        ts.add(25);
        
        System.out.println(ts);
        
    }
    
}

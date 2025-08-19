
package linkedlistclass;
import java.util.*;

public class LinkedListClass {

    public static void main(String[] args) {
        
        LinkedList<Integer> l1=new  LinkedList<>();
        
          LinkedList<Integer> l2=new  LinkedList<>(List.of(10,20,30,40,50));
                
        l1.addAll(l2);
        
        System.out.println(l1);
        
        l1.add(50);
           System.out.println(l1);
           
           l1.addFirst(44);
           l1.addLast(66);
            System.out.println(l1);
            
           System.out.println(l1.peek());  
               System.out.println(l1);
          System.out.println(  l1.poll());   //delete
             
           System.out.println(l1);
           
           
           l1.forEach(n->show(n));
    }
    
    static void show(int n)
    {
        if(n>50);
            System.out.println(n);
    }
}

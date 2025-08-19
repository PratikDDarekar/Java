
package priorityqueueclass;

import java.util.*;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
public class PriorityQueueclass {

 
    public static void main(String[] args) {
                                                       //object of MyComp
        PriorityQueue<Integer> p=new  PriorityQueue<>(new MyComp());
        
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15); 
        p.add(3);
        
        System.out.println(p.peek());//head element
        
        
        
        p.forEach(X->System.out.println(X+","));
         System.out.println("after Deletion");
        p.poll();//delete
         p.forEach(X->System.out.print(X+","));
        
        
    }
    
}

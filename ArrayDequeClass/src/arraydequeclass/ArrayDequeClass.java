
package arraydequeclass;
import java.util.*;

public class ArrayDequeClass {

    public static void main(String[] args) {
       
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
      //  System.out.println(dq);
//      dq.forEach(X->System.out.println(X));
      
      dq.offerFirst(1);
      dq.offerFirst(2);
      dq.offerFirst(3);
      dq.offerFirst(4);
      
         dq.forEach(X->System.out.println(X));
         
         dq.pollFirst();//behaving like a Queue
         dq.pollLast();//behaving like a stack
         
      System.out.println(dq);
    }
    
}

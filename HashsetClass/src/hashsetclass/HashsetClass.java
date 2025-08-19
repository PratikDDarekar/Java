
package hashsetclass;

import java.util.*;
//takes only Unique element
public class HashsetClass {

   public static void main(String[] args) {
                                      //size, loadingFactor space to occupy
       HashSet<Integer> hs=new HashSet<>(20,0.75f);
       
       hs.add(10);
        hs.add(20);
         hs.add(30);
          hs.add(10);
          
          System.out.println(hs);
    }
    
}

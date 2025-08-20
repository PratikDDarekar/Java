
package linkedhashmapclass;
import java.util.*;

public class LinkedHashMapClass {

   
    public static void main(String[] args) {
        //for Access Order
         LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true){
              //for Insetion Order
         // LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            
             //anonymous class we can make a separate class which can implements LinkedHashMap 
            protected boolean removeEldestEntry(Map.Entry e)//overriden method for setting limit eldest will be removed
            {
                return size()>5;//settimg limit
            }
        };
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        
    }
    
}

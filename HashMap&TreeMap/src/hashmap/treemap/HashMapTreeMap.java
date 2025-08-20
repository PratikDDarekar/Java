
package hashmap.treemap;
import java.util.Map.*;
import java.util.*;

public class HashMapTreeMap {

   
    public static void main(String[] args) {
       

//Treemap
System.out.println("TreeMap");
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        //you can't create a entry but you can get it's reference it is one of the entry containing the key and value
         //requires the Map package
        Entry<Integer,String> e=tm.firstEntry();
        
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
        
        
     //HashMap
     System.out.println("HashMap");
          HashMap<Integer,String> hm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        
      //  Entry<Integer,String> e=hm.firstEntry();
        
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
    }  
}
    
    


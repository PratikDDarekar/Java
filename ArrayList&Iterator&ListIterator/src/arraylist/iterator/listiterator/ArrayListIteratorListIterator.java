
package arraylist.iterator.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListIteratorListIterator {

    
    public static void main(String[] args) {
      
        ArrayList<Integer> al1=new ArrayList<>(20);//can change its size automatically
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,70,40,60,60,80,70,80,51));//static method therefore can call by using the calssname itself
        
        al1.add(1);
        al1.add(0, 5);
     //   al1.addAll(al2);
        al1.addAll(1,al2);
        System.out.println(al1); 
        
          System.out.println(al1.contains(57));//dowes it contains 
          
           System.out.println(al1.get(5));//gives the value stored at that index
            System.out.println(al1.indexOf(70));//gives the indec of that value from left to right
             System.out.println(al1.lastIndexOf(70));//gives the indec of that value from right to left
              al1.set(5, 101);
                System.out.println(al1);
                
                
                //PINTING USING DIFFERENT TYPES
//                for(int i=0;i<al1.size();i++)
//                {
//                    System.out.print(al1.get(i)+", ");
//                }

                
                  for(var X:al1)
                  {
                      System.out.print(X+" ");
                  }
   System.out.println();
                  
                  
 //iterator (Allows only unidirectional access)
            //uppercase I            lowercase i
            Iterator<Integer> it=al1.iterator();
            
            while(it.hasNext())
            {
                System.out.print("Using iterator by while loop "+it.next()+" ");
            }
            
              System.out.println();
              
              
                         
            //using for loop
            for( Iterator<Integer> it2=al1.iterator();it.hasNext();)//no need of updation
            {
                System.out.print("Using iterator by for loop "+it2.next()+" ");
            }
            
              System.out.println();
              
              
              
              
 //ListIterator (Allows bidirectional access
            //uppercase L            lowercase l
            ListIterator<Integer> lit=al1.listIterator();
            
            while(it.hasNext())
            {
                System.out.print("Using ListIterator by while loop "+lit.next()+" ");//it has methods like hasprevioue(),previour(),nextIndex(),previousIndex(),set(Integer e);
            }
             System.out.println();
            
            //using for loop
             
            
            for( ListIterator<Integer> lit2=al1.listIterator();it.hasNext();)//no need of updation
            {
                System.out.print("Using ListIterator by for loop "+lit2.next()+" ");//it has methods like hasprevioue(),previour(),nextIndex(),previousIndex(),set(Integer e);
            }
            
                        
    //lamdaexpression   
          al1.forEach(n->System.out.println(n));
              
           //Scoperesolution Operator   
          al1.forEach(System.out::println);           
            
           //lamdaexpression using show method  
          al1.forEach(n->show(n));    
    }
    
    static void show(int n)
    {
        if(n>60)
        {
            System.out.print(n+", ");
        }
    }
    }
    


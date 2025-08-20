/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtabledemo;

import java.util.*;
public class HashTableDemo {


    public static void main(String[] args) {
     
        //not generic
        // Hashtable ht=new Hashtable();
        
        // generic version
            Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        //neede in non generic version
        Enumeration e=ht.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        //i will have our own function here which will have the value based on the key so we can do our own mapping by this way
        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(ht);
    }
    
}

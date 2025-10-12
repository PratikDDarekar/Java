/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class CountryDriver {
    public static void main(String[] args) {
		
		ArrayList c1 = new ArrayList();
		
		c1.add(new Country("India","New Delhi","Dropdi Murmu",91));
		c1.add(new Country("New Zeland","Wellington","Rt Hon Christopher Luxon",64));
		c1.add(new Country("United States", "Washington, D.C.", "Joe Biden", 1));
		c1.add(new Country("India","New Delhi","Dropdi Murmu",91));
		c1.add(new Country("Japan", "Tokyo", "Fumio Kishida", 81));
		c1.add(new Country("France", "Paris", "Emmanuel Macron", 33));
		c1.add(new Country("India","New Delhi","Dropdi Murmu",91));
		
//		System.out.println(c1);
//		
//		LinkedList l1 = new LinkedList(c1);
//		
//		System.out.println(l1);
		
//		Stack s1 = new Stack(l1);                there is no constructor for stack which can accept collection
		
//		Vector v1 = new Vector(l1);
		
//		System.out.println(v1);                  // Vector have constructor which accept collection because it doent follow LIFO 
//		
//		
		System.out.println(c1.size());
//		
//		HashSet h1 = new HashSet(c1);
//		
//		System.out.println(h1.size());
//		
		
//		LinkedHashSet l1 = new LinkedHashSet(c1);
//		
//		System.out.println(l1.size());
		
		Comparator<Country> comp =(o1,o2)->o2.name.compareTo(o1.name)>1?0:(o2.name.compareTo(o2.name)==0?0:-1);
		
		
		TreeSet t1 = new TreeSet(comp);
		
		t1.addAll(c1);
		System.out.println(t1.size());
		
		
		
		
		
		
	}
}

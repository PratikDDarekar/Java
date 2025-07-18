/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author darek
 */
public class Student {
    int rollno;
    String name;
    String course;
    int m1,m2,m3;

    
     public int total(){
      return m1+m2+m3;
     }
     
      public int average(){
       return total()/2;
     }
      
        public String grade(){
         if(average()>80)
         {  
          return "A";
         }
         else if(average()>60)
         return "B";
         
         else if(average()>40)
          return "C";
         else
             return "fail";
        }
        public String toString()
        {
            return "Name "+name+ " Rollno. is : "+ rollno +", Total Marks : "+total()+", Average : "+ average()+"%, Grade  : "+grade();
        }
        
        
    //rollno,name course m1..m3  total average grade
}
 class StudentTest {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s = new Student();
         s.rollno=7;
         s.name="Mahesh";
         s.course="Computer Science";
         s.m1=30;
         s.m2=30;
         s.m3=30;
         System.out.println( s);
        
        System.out.println();
                 
        Student s1 = new Student();
         s1.rollno=8;
         s1.name="Divyesh";
         s1.course="Computer Science";
         s1.m1=10;
         s1.m2=10;
         s1.m3=10;
          System.out.println( s1);
        
        
        System.out.println();
                 
        Student s2 = new Student();
         s2.rollno=9;
         s2.name="Pranav";
         s2.course="Electroncs and Telecommunication";
         s2.m1=100;
         s2.m2=100;
         s2.m3=100;
          System.out.println( s2);
        
    }
    
}

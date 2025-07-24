/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface3;

/**
 *
 * QSPIDER
 */

interface Placement
{
    void placed();
}

class Student implements Placement
{
    String name;
    
    Student(String n)//parameterize constructor
    {
        name=n;
    }
    
   public void placed()//overrided method
   {
       System.out.println("I Am Placed from : "+name);
   }
}

class Qspider
{
    Placement p[]= new Placement[15];//creating an objects
    int count=0;
    
    public void appeared(Placement p)
    {
       this.p[count++]=p; //storing and updating the objects
    }
    
    public void student()
    {
        for(int i =0; i<count;i++)
        {
            p[i].placed();
        }
    }
}
class TestQspider
{
   public static void main(String[] args) {  

    
    Student s1 = new Student("Pratik1");
    Student s2 = new Student("Pratik2");
    Student s3 = new Student("Pratik3");
    Student s4 = new Student("Pratik4");
    Student s5 = new Student("Pratik5");
    Student s6 = new Student("Pratik6");
    Student s7 = new Student("Pratik7");
    Student s8 = new Student("Pratik8");
    Student s9 = new Student("Pratik9");
    Student s10 = new Student("Pratik10");
    
    Qspider q = new Qspider();
    
    q.appeared(s1);//student how appeared for the exam and got selected
    q.appeared(s2);
    q.appeared(s3);
    q.appeared(s4);
    q.appeared(s5);
    q.appeared(s6);
    q.appeared(s7);
    q.appeared(s8);
    q.appeared(s9);
    q.appeared(s10);
    
    
    q.student();//calling placed student
    
   }  
}    
    

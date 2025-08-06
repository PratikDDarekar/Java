
package studentchallengeinterthreadcommunication;

class WhiteBoard
{
    String text;//reading and writing
    int noStud=0;
    int count=0;
    
    
    public void attendance()
    {
        noStud++;//increment the number of student
    }
    
   synchronized void write(String t)
   {
       System.out.println("Teacher writes : "+t);

       while(count!=0)
       {
           try{wait();}catch(Exception e){}
       }
       text = t;
       count=noStud;//if the number of student is four the count is 4 and it means the number of student are reading the count is decrementing and when again count becone 0 means teacher will get a chance to write something
       notifyAll();
       
   }
   
   synchronized  String read()
   {
       while(count==0)
       {
           try{wait();}catch(Exception e){}
       }
       
       String t= text;
       count--;///////////////////////////////
       
       if(count==0)
       {
           notify();
       }
       return t;
   }  
}

class Teacher extends Thread
{
     WhiteBoard wb;
    
       String notes[]={"Java is a language","It is OOPs","It supports MultiThreading","end"};
     
    Teacher(WhiteBoard w)
    {
        this.wb=w;
    } 
     
    public void run()
    {
         for(int i=0; i<notes.length;i++){
           wb.write(notes[i]);
         }
    }
}

class Student extends Thread
{
    String name;
    WhiteBoard wb;
     
    Student(WhiteBoard wb, String n)
    {
        this.wb=wb;
        name=n;
    } 
     
     public void run()
     {
         String text;//////////////////////
         wb.attendance();//////////////////////
         
         
         do///////////////////////////////
         {
             text=wb.read();
             System.out.println(name + " Reading : "+text);
             System.out.flush();///////////////////////           
         }while(!text.equals("end"));
     }
}




public class StudentChallengeinterthreadcommunication 
{ 
    public static void main(String[] args) { 
        
        WhiteBoard wb = new WhiteBoard();
        
        Teacher t = new Teacher(wb);
        Student s1 = new Student(wb,"Pratik");
         Student s2 = new Student(wb,"Rutik");
          Student s3 = new Student(wb,"Kushal");
           Student s4 = new Student(wb,"Amol");
            Student s5 = new Student(wb,"Krishna");
         
        
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
                
        
    }   
}

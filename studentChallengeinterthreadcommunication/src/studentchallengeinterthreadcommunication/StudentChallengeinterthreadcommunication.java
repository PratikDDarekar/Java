
package studentchallengeinterthreadcommunication;

class WhiteBoard
{
    String text;//reading and writing
    int noStud=0;
    int count;
    
   synchronized void write(String str)
   {
       text = str;
       
   }
   
   synchronized  String read()
   {
       String r;
       r = text;
       return r;
   }  
}

class Teacher extends Thread
{
     WhiteBoard wb;
    
    Teacher(  WhiteBoard wb){this.wb=wb;} 
    
    String str[]={"Java is a language","It is OOPs","It suppoerts MultiThreading","end"};
    
    public void run()
    {
         for(int i=0; i<str.length;i++){
             System.out.println("Teacher writes : "+str[i]);
            wb.write(str[i]);
         }
    }
}

class Student extends Thread
{
     WhiteBoard wb;
    
     Student( WhiteBoard wb){this.wb=wb;} 
     
     public void run()
     {
         System.out.println("S reads : "+wb.read());
     }
}







public class StudentChallengeinterthreadcommunication { 
    public static void main(String[] args) { 
        
        WhiteBoard wb = new WhiteBoard();
        
        Teacher t = new Teacher(wb);
        Student s = new Student(wb);
        
        t.start();
        s.start();
        
    }   
}

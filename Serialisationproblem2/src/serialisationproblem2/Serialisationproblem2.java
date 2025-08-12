
package serialisationproblem2;
import java.io.*;
class Student 
{
    int rollno;
    String name;
    String dept;
    float avg;
}


class MyWrite 
{

    public static void main(String[] args)throws Exception
    {
     FileOutputStream fos = new FileOutputStream("D:\\Student.txt");
     DataOutputStream dos= new DataOutputStream(fos);
     
     Student s=new Student(); 
     
     s.dept="Cse"; 
     s.name="Prtik";
     s.rollno= 10;
     s.avg=102f;
     
     dos.writeInt(s.rollno);
     dos.writeUTF(s.name);
     dos.writeUTF(s.dept);
     dos.writeFloat(s.avg);
      
     dos.close();
     fos.close();
     
    }
    
}


class MyRead 
{

    public static void main(String[] args)throws Exception
    {
     FileInputStream fis = new FileInputStream("D:\\Student.txt");
     DataInputStream dis= new DataInputStream(fis);
     
     Student s=new Student(); 
     
  s.rollno=dis.readInt();//order is important
  s.name=dis.readUTF();
  s.dept=dis.readUTF();
  s.avg=dis.readFloat();
  
  System.out.println("Rollno "+s.rollno);
  System.out.println("Name "+s.name);
  System.out.println("Average "+s.avg); 
  System.out.println("Dept "+s.dept);
  
 
      
     dis.close();
     fis.close();
     
    }
    
}

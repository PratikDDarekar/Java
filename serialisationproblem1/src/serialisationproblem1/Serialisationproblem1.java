
package serialisationproblem1;

import java.io.*;




class Student
{
    int rollno;
    String name;
    String dept;
}


class writing {

 
    public static void main(String[] args)throws Exception 
    {
       FileOutputStream fos = new  FileOutputStream("D:\\Test.txt");
       PrintStream ps= new PrintStream(fos);//thisclass take object as arguement
       
       
       Student s=new Student();
       s.rollno=10;
       s.name="John";
       s.dept="CSE";
       
       ps.println(s.rollno);
       ps.println(s.name);
       ps.println(s.dept);
       
       ps.close();
       fos.close();
    }
    
}

 class Reading {

 
    public static void main(String[] args)throws Exception 
    {
       FileInputStream fis = new  FileInputStream("D:\\Test.txt");
       BufferedReader br= new BufferedReader(new InputStreamReader(fis));//creating annonymous object as buffer takes the object
       
       
       Student s=new Student();
       s.rollno=Integer.parseInt(br.readLine());
       s.name=br.readLine();
       s.dept=br.readLine();
       
       System.out.println(s.rollno);
       System.out.println(s.name);
       System.out.println(s.dept);
       
      
    }
    
}
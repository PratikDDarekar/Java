
package arrayofobject;


public class ArrayOfObject {  
    //this module contains 2 examples of it
}


class Subject
{
 private String subId;
 private String name;
 private int maxMarks;
 private int marksObtain;
 
 //getMethods
  public String getdubId(){return subId;}
  public String name(){return subId;}
  public int getmaxMarks(){return maxMarks;}
  public String subId(){return subId;}
  
  //setMethods
  public void setmaxMarks(int maxM)
  {
      maxMarks = maxMarks;
  } 
    public void setmarksObtain(int marksOb)
  {
      marksObtain = marksOb;
  } 
  
    //COnstructors ( for same attribute_name you can use this keyword)
  public Subject(String subId, String name, int maxMarks, int marksObtain)
  {
  this.subId = subId;
    this.name =  name;
    this.maxMarks = maxMarks;
    this.marksObtain = marksObtain ;
  }
   //Methods   
  boolean isQualified()
  {
      return marksObtain>=maxMarks/10*4;
  }  
  public String toString()
  {
      return "\nSubject ID : "+subId+"\nName : "+name+"\nMarksObtained : "+marksObtain;
  }    

}

class StudentTest
{
   public static void main(String[] args)
   {
     Subject subs[] = new Subject[4];
     
     subs[0]=new Subject("73883vv","OM",100,98) ;
     subs[1]=new Subject("73883bb","Rohan",100,91) ;
     subs[2]=new Subject("73883ff","Mayur",100,68) ;
     subs[3]=new Subject("73883cc","Pankaj",100,48) ;
     
     
    
   for(Subject X : subs)
   {
    System.out.println(X);
   }
   Subject s = new Subject("637g","Ram",100,83);
   System.out.println(s);
   }
}

class Student2
{
private int rollno;
private String name;
private String dept;
private String[] subj; //make it array

public int getrollno(){ return rollno;}
public String getname(){ return name;}
public String getdept(){ return dept;}
public String[] getsubj(){ return subj;}

public void setSubjects(String ...sub)
{
    subj = sub;
}
public Student2(int rollno, String name, String dept, String ...subj)
{
this.dept=dept;
this.name=name;
this.rollno=rollno;
this.subj=subj;

}

public String toString()
{
    return "\n rollno: "+rollno + "\n name: "+name+ "\ndept: " +dept+"\nsubj: "+subj ;
}
}

class Student2Test
{
   public static void main(String args[])
   {
      Student2 s = new Student2(43,"prajwal","ENTC"); 
      s.setSubjects("english");
      System.out.println(s);
       
   } 
    
    
}
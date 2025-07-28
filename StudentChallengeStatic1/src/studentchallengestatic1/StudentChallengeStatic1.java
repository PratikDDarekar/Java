package studentchallengestatic1;
import java.util.Date;// we import class call Date so therefore we can alsomake its object

class Student
{
    private String rollno;
    private static int count=1;//it is static and modifiable
    
    Student()
    {
        rollno = generateRollno();
    }
    
    private  String generateRollno()//this method generating new rollno for every student object generated and assigned it to them
    {
        Date d = new Date();
        
        String rno ="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    public String getRollno()
    {
        return "rollno is = "+ rollno;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Student s1 =new Student();
        Student s2 =new Student();
        Student s3 =new Student();
        
        
        System.out.println(s1.getRollno());
         System.out.println(s2.getRollno());
          System.out.println(s3.getRollno());
        

    }
}
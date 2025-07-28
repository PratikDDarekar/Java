package singletonclass2;


class Student
{
    static Student s =new Student();
    
    private Student(){System.out.println("constructor initializes");}
    
    static Student getInstance()
    {
        return s;
    }
}
class Test
{
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();
        Student s4 = Student.getInstance();
        
        
}
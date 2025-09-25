
package arraysprogram;


public class ArraysProgram {

 
    public static void main(String[] args) {
       
        
        String[] student={"Pratik","123","BE","2025","7.39"};

     
   //Arrays.sort(student);
   int i=0;
   int j=student.length-1;
   
   //swap/reversing
   
  while(i<j)
  {
  String  temp = student[i];
    student[i] = student[j];
    student[j] = temp;
    i++;j--;
  }
  
  //printing
  for(int k=0;k<student.length;k++)
  {
      System.out.print(student[k]+" ");
  }

    }
    
}


package studentchallengecopying.the.file;
import java.io.*;

public class StudentChallengeCopyingTheFile {

    public static void main(String[] args) {
        try{
       FileInputStream fis=new FileInputStream("D:/Test.txt"); 
       FileOutputStream fos=new FileOutputStream("D:/source.txt"); 
       int b;
       while((b=fis.read())!=-1)
       {
           if(b>65 && b<=90)
               fos.write(b+32);
           else fos.wait(b);
       }
        
        }
        catch(IOException e){}
        catch(Exception e){}
    }
    }
    


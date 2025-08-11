
package bufferedstreamclass;
import java.io.*;

public class BufferedStreamclass {

   
    public static void main(String[] args)
    {
       try{
        FileInputStream fis = new FileInputStream("D:/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
//        int x;
//        while((x=bis.read())!=-1)
//        {
//            System.out.println((char)x);
//        }
 //       System.out.println("File "+fis.markSupported());
 //         System.out.println("buffer "+bis.markSupported());
 
 
    System.out.println((char)bis.read());
    System.out.println((char)bis.read());
    System.out.println((char)bis.read());
    bis.mark(10);
     System.out.println((char)bis.read());
     System.out.println((char)bis.read());
    bis.reset();
     System.out.println((char)bis.read());
     System.out.println((char)bis.read());
     
          
       }
       catch(IOException e){}
        
    }
    
}


package bufferedreaderclass;

import java.io.*;
public class BufferedReaderclass {

        public static void main(String[] args)
    {
       try{
        FileReader fis = new FileReader("D:\\Test.txt");
        BufferedReader bis = new BufferedReader(fis);
        
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
     
          
     
     System.out.println(bis.readLine());
       }
       catch(IOException e){}
        
    }
    
}

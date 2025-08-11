
package chararrayreader;
import java.io.*;
public class CharArrayReader {

   
    public static void main(String[] args) {
      
        char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr = new CharArrayReader(c); 
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }
        cr.close();
    }
    
}

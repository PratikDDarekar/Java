
package bytearrayoutputstream;
import java.io.*;

public class ByteArrayOutputStream {


    public static void main(String[] args) throws Exception
    {
        
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');
        byte b[]= bos.toByteArray();
        for(byte x:b)
            System.out.println((char)x);
        
        bos.close();
    }
    
}


package bytestream;
import java.io.*;

public class ByteStream {

    
    public static void main(String[] args) throws Exception
      {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        
        ByteArrayInputStream bis = new ByteArrayInputStream(b);//array given refereve to the object
        
        String str= new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println(bis.markSupported());//markSupported means we are read the data multiple times in array but file we can't because the pointer in file continuously keeps on moving
        
    }
    
}

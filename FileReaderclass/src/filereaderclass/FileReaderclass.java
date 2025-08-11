
package filereaderclass;

import java.io.*;

public class FileReaderclass {

    
    public static void main(String[] args) {
       
//        try
//        {//create object 
//        FileReader fis = new Filereader("D:/Test.txt");
//        //this will give me how may bits are available in the method
//        byte b[]= new byte[fis.available()];
//        //reading the file
//        fis.read(b);
//        //storing the b inside string so that to read it
//        String str=new String(b);
//        //printing
//        System.out.println(str);      
//        }
//        catch(IOException e)
//        {
//            System.out.println(e);
//        }
//      


//reading bits by bits
         try
        {//create object 
            
        FileReader fis = new FileReader("D:/Test.txt");
        int x;
        
//        do
//        {
//            x=fis.read();
//            if(x!=-1)
//            System.out.print((char)x);
//        }while(x!=-1);

//OR

        while((x=fis.read())!=-1)
        {
          System.out.print((char)x);
        }
              
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
    
}

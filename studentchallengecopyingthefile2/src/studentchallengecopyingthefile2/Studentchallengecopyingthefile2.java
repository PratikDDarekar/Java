
package studentchallengecopyingthefile2;


public class Studentchallengecopyingthefile2 {

    
    public static void main(String[] args) {
       
        try{
        FileInputStream fis1=new FileInputStream("Source1.txt");
         FileInputStream fis2=new FileInputStream("Source2.txt");
          FileOutputStream fos=new FileOutputStream("Destination.txt");
          
          SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
          
          int b;
          while((b=sis.raed())!=1)
          {
          fos.write(b);
          }
        
          sis.close();
          fis1.close();
          fis2.close();
          fos.close();
        }
        catch(Exception e){}
        
    }
    
}

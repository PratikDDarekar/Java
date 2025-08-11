package fileoutputstreamclass;

import java.io.*;

public class FileOutputStreamClass {

    public static void main(String[] args) {

        // You can use either absolute or relative path.
        // If the file is in the same directory as the .class file, just use the filename.
        try {
            // Creating the FileOutputStream resource
            FileOutputStream fos = new FileOutputStream("D:/Text.txt"); // No space after D:/

            String str = " Learning Java Programming";

            // Convert the string into a byte array and write it to the file using  byte[] to insert arrays of byte
            // fos.write(str.getBytes());

            
            //inserting 1 byte by byte
            byte b[]= str.getBytes();
            
            for(byte x:b)
            fos.write(x);
            
           
            
            //inserting the byte by using the offset
            //byte b[] = str.getBytes();          
            //fos.write(b,6 , str.length()-6);
            // Close the stream to release the resource
            fos.close();

            System.out.println("File written successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e);
        }
    }
}
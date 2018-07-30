import java.io.*;

/**
 * Inputstrign
 */
public class Inputstrign {

    public static void main(String[] args) {
       try {
        FileInputStream inputStream = new FileInputStream("inputtext.txt");

        int data = inputStream.read();
        
        while (data != -1) {
            // System.out.print(data); //It is byte data , read in a stack  
            System.out.print((char)data); //transform the byte in character 
            data = inputStream.read();    //data returns the byte     
        }
        inputStream.close();

       } catch (Exception e) {
           //TODO: handle exception
           System.out.println(e.toString());
       }
        
    }
}
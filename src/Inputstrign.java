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
            System.out.println(data);
            data = inputStream.read();        
        }
        inputStream.close();

       } catch (Exception e) {
           //TODO: handle exception
           System.out.println(e.toString());
       }
        
    }
}
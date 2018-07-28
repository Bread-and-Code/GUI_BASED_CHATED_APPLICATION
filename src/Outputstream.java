import java.io.*;

/**
 * Outputstream
 */
public class Outputstream {

    public static void main(String[] args) {
        try {
            FileOutputStream fileoutput = new FileOutputStream("outputfile.txt");
        char b = 'b' ;
        fileoutput.write((char)b);

        String text = "This is output String";
        fileoutput.write(text.getBytes());// it can't take string .
        fileoutput.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.toString());
        }
    }
}
import java.io.*;

/**
 * Characterstream
 */
public class Characterstream {

    public static void main(String[] args) {
        try {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("characterstream1.txt"));
//point to noted that we cant use File inputstream with outputstream writer and vice cersa . it creats 
// I/O problems (exception).
        InputStreamReader in = new InputStreamReader(new FileInputStream("characterstream1.txt"));

        out.write("string to input" );

        out.flush();
        // difference between the flash methods and close methods ? 
        // out.close();


        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.toString());
        }
    }
}

/*


// Note : the flash methods and close methods seems the same but there are difference
// the flash methods temper the stream bout doesnt  close it. so if there are any next 
// command to execute ; then this can be execute . 
// but in close  , it close the input stream . so if there are any next commandto perform
// then it returns the I/O  exception and the next commanfd will not execute .   


*/









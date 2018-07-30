import java.io.IOException;
import java.net.ServerSocket;

/**
 * LocalPortScanner
 */
public class LocalPortScanner {

    public static void main(String[] args) {
        int port = 1;
            //Server scoket throws IOException and take the port as input 
        while (port < 65535) {
            try {
            //Server scoket throws IOException and take the port as input 
                ServerSocket server = new ServerSocket(port);
                // System.out.println("The open port is :"+port);
            } catch (IOException e) {
                //TODO: handle exception
                System.out.println("The port is open "+port);
            }
            port++ ;
            
        }
    }
}
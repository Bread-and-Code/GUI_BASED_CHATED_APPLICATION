import java.io.*;
import java.net.*;

/**
 * Server
 */
public class Server {

    public static void main(String[] args) {
        
       try {
        // int port = 9090 ;
        ServerSocket serverSocket = new ServerSocket(9090); 
        System.out.println("Waiting for clients");
        Socket socket = serverSocket.accept();
        //printer takes outputstream and boolian autoflash
        //so printwriter takes the out put through outputstream of the socket
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println("Hello clients");
        //Now take the input from the clients .The client can send a large input .
        //so devided this . Use the buffer to break down the client response .
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //here i never use a new socket to get input and output from the clients 

        String clientinput = input.readLine();
        System.out.println(clientinput);
        input.close();
        out.close();
        socket.close();
       } catch (IOException e) {
           //TODO: handle exception
           System.out.println("IOE Exception occurs");
       }
    }
}
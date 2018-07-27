/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        /*
        * TO DO
        */
        ServerThread thread = new ServerThread("Server 1");  //set the 1st server name 
        ServerThread thread2 = new ServerThread("Server 2");
        thread.start();
        thread2.start();
        //priority setting
        thread2.setPriority(thread.MAX_PRIORITY);
        System.out.println(thread2.getName()+ " Has priority of  "+ thread2.getPriority());
    }
} 
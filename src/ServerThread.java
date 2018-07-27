public class ServerThread extends Thread{

    public String threadName;


    public ServerThread(){
        this.threadName = "NO SERVER NAME IS PRESENT";   // is it needed? is it working? -sayan
    }

   public ServerThread(String threadName){
       this.setName(threadName);     //it set the server name 
    //    this.threadName = threadName ;
   }
   public void run() {
       try {
        int clientNumber = 1;
        while (clientNumber != 100) {
            // let the server send the single line only (test 1)
            /* Get the server name from main */
            System.out.println(this.getName() +" send data to the clientNumber : "+clientNumber); 
            //sleep has unreported exception InterruptedException; must be caught or declared to be thrown
            Thread.sleep(1000); 
            clientNumber++;
        }
       } catch (Exception e) {
           //TODO: handle exception
           System.out.println(e.toString());
       }
       
   }
}

import java.io.*;

/**
 * Datastream
 */
public class Datastream {

    public static void main(String[] args) {
// Create a file
        File file = new File("datastream1.txt");
// Create a new file and exception handling 
        if (file.exists()) {

            System.out.println("the file is already exists in the dir "+file.getName());            
        } else {
            
            try {
                if (file.createNewFile()) {
                    System.out.println("THe new file is created at location "+file.getPath());
                    System.out.println("THe location is "+file.getAbsolutePath());
                } else {
                    System.out.println("Caan't creat the file ");
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.toString());
            }
        }
// it take the output file and sent it to Dataoutput stream :)  it need a exception handling
// process , so put it in exception 
        try {
            //data output it's write into the file 
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            
//  File is produced and entered as input so read  from the created file


/*
// it returns a error    why ????? 
*/
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
                
            out.writeInt(100);
            out.writeDouble(100.00);
            out.writeFloat(123.1234F);

            Double var1 = in.readDouble();
            int var2 = in.read();
            float var3 = in.readFloat();
        
            System.out.println("THe readed double is : "+var1);
            System.out.println("THe readed int is : "+var2);
            System.out.println("THe readed float is : "+var3);
            in.close();
            out.close();



        } catch (Exception e) {
            System.out.println(e.toString());
        }



    }
}



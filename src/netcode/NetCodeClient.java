/*
 * Author:     John Andrew S Duvall
 * Date:       date
 * Project:    project
 */
package netcode;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Alabastor
 */
public class NetCodeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket MyClient;
        DataInputStream input;
        PrintStream output;
        int port = 10101;
        
        try{
            MyClient = new Socket("Mianaai", port);
            input = new DataInputStream(MyClient.getInputStream());
            output = new PrintStream(MyClient.getOutputStream());
            
            
            output.close();
            input.close();
            MyClient.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}

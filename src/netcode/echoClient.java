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
public class echoClient {
    Socket echoClient;
    private DataInputStream input;
    private PrintStream output;
    private int port;
    
        void run(String name, int port){
            try{
                echoClient = new Socket(name, port);
                input = new DataInputStream(echoClient.getInputStream());
                output = new PrintStream(echoClient.getOutputStream());

                
                
                output.close();
                input.close();
                echoClient.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
}

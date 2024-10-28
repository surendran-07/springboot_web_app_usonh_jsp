package sem;
import java.io.*;
import java.net.*;

public class prg16 {
	public static void main (String [] args) throws IOException{
		ServerSocket server=new ServerSocket(8081);
		while(true) {
			Socket client=server.accept();
			PrintWriter out =new PrintWriter( client.getOutputStream(),true);
			System.out.println("http/1.1200 ok\n content-type:text/html\n\n <html><body><h1>hello world </h1></body></html>");
			client.close();
		}
	}

}

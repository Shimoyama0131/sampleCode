package practice;

import java.io.*;
import java.net.*;

public class Main_11 {
	public static void main(String[] args) throws IOException{
		// ���X�g11-1
//		URL url = new URL("http://dokojava.jp");
//		InputStream is = url.openStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		int i = isr.read();
//		while(i != -1) {
//			System.out.print((char) i);
//			i = isr.read();
//		}
//		isr.close();
		
		// ���X�g11-2
//		Socket sock = new Socket("dokojava.jp", 80);
//		InputStream is = sock.getInputStream();
//		OutputStream os = sock.getOutputStream();
//		os.write("GET /index.html HTTP/1.0\r\n".getBytes());
//		os.write("\r\n".getBytes());
//		os.flush();
//		InputStreamReader isr = new InputStreamReader(is);
//		int i = isr.read();
//		while(i != -1) {
//			System.out.print((char) i);
//			i = isr.read();
//		}
//		sock.close();
		
		// ���X�g11-3
		System.out.println("�N�������B");
		ServerSocket svSock = new ServerSocket(39648);
		Socket sock = svSock.accept();
		System.out.println(sock.getInetAddress() + "����ڑ�");
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.close();
	}
}

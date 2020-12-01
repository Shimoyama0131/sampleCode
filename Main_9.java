package practice;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main_9 {
//	public static void main(String[] args) throws IOException {
		// リスト9-1
//		FileWriter fw = new FileWriter("c:\\rpgsabe.dat", true);
//		fw.write('A');
//		fw.flush();
//		fw.close();
		
		// リスト9-2
//		FileReader fw = new FileReader("rpgsave.dat");
//		System.out.println("全てのデータを読んで表示します");
//		int i = fw.read();
//		while(i != -1) {
//			char c = (char) i;
//			System.out.print(c);
//			i = fw.read();
//		}
//		System.out.println("ファイルの末尾の到達しました");
//		fw.close();
		
		// リスト9-3
//		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
//		fos.write(65);
//		fos.flush();
//		fos.close();
		
		// リスト9-5
//		String msg = "第1土曜";
//		Reader sr = new StringReader(msg);
//		char c1 = (char) sr.read();
//		char c2 = (char) sr.read();
		
		// リスト9-6
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		baos.write(65);
//		baos.write(66);
//		byte[] data = baos.toByteArray();
//	}
	
//	public static void main(String[] args) {
//		// 9-4
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("rpgsave.dat", true);
//			fw.write('A');
//			fw.flush();
//		}catch(IOException e) {
//			System.out.println("ファイル書き込みエラー");
//		}finally {
//			if(fw != null) {
//				try {
//					fw.close();
//				}catch(IOException e2) {}
//			}
//		}
//	}
}

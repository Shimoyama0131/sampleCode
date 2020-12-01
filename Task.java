package practice;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.net.*;


//// 6��_�ۑ�6-1
//interface Func1{
//	boolean call(int x);
//}
//interface Func2{
//	String call(boolean male, String name);
//}
public class Task {
//	// 1��_�ۑ� 1-1
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<100; i++) {
//			sb.append(i+1).append(",");
//		}
//		String s = sb.toString();
//		String[] a = s.split(",");
//	}
	
//	// 1��_�ۑ� 1-2
//	String concatPath(String folder, String file) {
//		if(!folder.endsWith("\\")) {
//			folder += "\\";
//		}
//		return folder + file;
//	}
	
//	// 2��_�ۑ� 2-1
//	public static void main(String[] args) {
//		// �@���݂̓�����Date�^�Ŏ擾
//		Date now = new Date();
//		Calendar c = Calendar.getInstance();
//		// �A�擾�������t����Calendar�ɃZ�b�g
//		c.setTime(now);
//		// �BCalendar����u���v�̏����擾
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		// �C�擾�����l��100�𑫂���Calendar�́u���v�ɃZ�b�g
//		day += 100;
//		c.set(Calendar.DAY_OF_MONTH, day);
//		// �DCalendar�̓��t����Date�^�ɕϊ�
//		Date future = c.getTime();
//		// �E�w�肳�ꂽ�`���ŕ\��
//		SimpleDateFormat f = new SimpleDateFormat("����yyyy�NMM��dd��");
//		System.out.println(f.format(future));
//	}
	
//	// 2��_�ۑ� 2-2
//	public static void main(String[] args) {
//		LocalDate now = LocalDate.now();
//		// LocalDate future = now.plusDays(100); //�ǂ��炩
//		LocalDate future = now.plus(Period.ofDays(100)); // �ǂ��炩
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("����yyyy�NMM��dd��");
//		System.out.println(future.format(f));
//	}
	
//	// 3��_�ۑ� 3-2
//	public static void main(String[] args) {
//		Hero h1 = new Hero("�֓�");
//		Hero h2 = new Hero("���");
//		List<Hero> heroes = new ArrayList<Hero>();
//		heroes.add(h1);
//		heroes.add(h2);
//		for(Hero h : heroes) {
//			System.out.println(h.getName());
//		}
//	}
	
//	// 3��_�ۑ� 3-3
//	public static void main(String[] args) {
//		Hero h1 = new Hero("�֓�");
//		Hero h2 = new Hero("���");
//		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
//		heroes.put(h1, 3);
//		heroes.put(h2, 7);
//		for(Hero key : heroes.keySet()) {
//			int value = heroes.get(key);
//			System.out.println(key.getName() + "���|�����G=" + value);
//		}
//	}
	
//	// 4��_�ۑ�4-1
//	// Book.java
	
//	// 5��_�ۑ�
//	// StrongBox.java
	
	
//	// 6��_�ۑ�6-1
//	public static void main(String[] args) {
//		// 6��_�ۑ�6-1
//		FuncList funclist = new FuncList();
//		Func1 f1 = FuncList::isOdd;
//		Func2 f2 = funclist::addNamePrefix;
//		System.out.println(f1.call(15));
//		System.out.println(f2.call(true, "Smith"));
		
//		// 6��_�ۑ�6-2
//		Func1 f1 = x -> x%2==1;
//		Func2 f2 = (male, name)->{
//			if(male==true) {
//				return "Mr."+name;
//			}else {
//				return "Ms."+name;
//			}
//		};
//	}
	
	// 9��_�ۑ�9-1
//	public static void main(String[] args) throws Exception {
//		String inFile = args[0];
//		String outFile = args[1];
//		FileInputStream fis = new FileInputStream(inFile);
//		FileOutputStream fos = new FileOutputStream(outFile);
//		int i = fis.read();
//		while(i != -1) {
//			fos.write(i);
//			i = fis.read();
//		}
//		fos.flush();
//		fos.close();
//		fis.close();
//	}

//	// 9��_�ۑ�9-2
//	public static void main(String[] args) {
//		String inFile = args[0];
//		String outFile = args[1];
//		FileInputStream fis = null;
//		GZIPOutputStream gzos = null;
//		try {
//			fis = new FileInputStream(inFile);
//			FileOutputStream fos = new FileOutputStream(outFile);
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			gzos = new GZIPOutputStream(bos);
//			int i = fis.read();
//			while(i != -1) {
//				gzos.write(i);
//				i = fis.read();
//			}
//			gzos.finish();
//			gzos.close();
//			fis.close();
//		}catch(IOException e) {
//			System.err.println("�t�@�C������Ɏ��s���܂���");
//			try {
//				if(fis != null) {
//					fis.close();
//				}
//				if(gzos != null) {
//					gzos.close();
//				}
//			}catch(IOException e2) {}
//		}
//	}
	
	
	public static void main(String[] args) throws Exception{
//		// 10��_�ۑ�10-1
//		Reader fr = new FileReader("c:\\pref.properties");
//		Properties p = new Properties();
//		p.load(fr);
//		System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
//		fr.close();
//		
//		// 10��_�ۑ�10-2
//		Employee tanaka = new Employee();
//		tanaka.name = "�c����Y";
//		tanaka.age = 41;
//		Department soumubu = new Department();
//		soumubu.name = "������";
//		soumubu.leader = tanaka;
//		FileOutputStream fos = new FileOutputStream("c:\\company.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(soumubu);
//		oos.flush();
//		oos.close();
		
//		// 11��_�ۑ�11-1
//		URL url = new URL("http://dokojava.jp/favicon.ico");
//		InputStream is = url.openStream();
//		OutputStream os = new FileOutputStream("dj.ico");
//		int i = is.read();
//		while(i != -1) {
//			os.write((byte) i);
//			i = is.read();
//		}
//		is.close();
//		os.flush();
//		os.close();
		
		// 11��_�ۑ�11-2
		Socket sock = new Socket("smtp.example.com", 60025);
		OutputStream os = sock.getOutputStream();
		os.write("HELO example.com\r\n".getBytes());
		os.flush();
		sock.close();
	}
	
}

//// 11��_11-1�A11-2
//class Employee{
//	String name;
//	int age;
//}
//class Department{
//	String name;
//	Employee leader;
//}

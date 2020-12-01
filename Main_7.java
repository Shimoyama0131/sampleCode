package practice;

import java.util.*;
import java.lang.reflect.*;

public class Main_7 {
//	public static void main(String[] args){
		// リスト7-1
//		/* データ読み込み*/
//		boolean f=true;
//		if(!f) {
//			System.out.println("データが壊れてます。異常終了します。");
//			System.exit(1);
//		}
//		System.out.println("正常終了しました。");
		
		// リスト7-3
//		System.out.println("ご利用のJavaのバージョン");
//		System.out.println(System.getProperty("java.version"));
//		Properties p = System.getProperties();
//		Iterator<String> i = p.stringPropertyNames().iterator();
//		System.out.println("【システムプロパティ一覧】");
//		while(i.hasNext()) {
//			String key = i.next();
//			System.out.print(key + "=");
//			System.out.println(System.getProperty(key));
//		}
		
		// リスト7-4
//		String ver = System.getProperty("rpg.version");
//		String author = System.getProperty("rpg.author");
//		System.out.println("RPG:スッキリ魔王征伐 ver" + ver);
//		System.out.println("Developed by" + author);
		
		// リスト7-5
//		Class<?> info1 = String.class;
//		System.out.println(info1.getSimpleName()); //⇒ String
//		System.out.println(info1.getName()); //⇒ java.lang.String
//		System.out.println(info1.getPackage().getName()); //⇒ java.lang
//		System.out.println(info1.isArray()); //⇒ false
//		
//		Class<?> info2 = info1.getSuperclass();
//		System.out.println(info2.getName()); //⇒ java.lang.Object
//		
//		Class<?> info3 = args.getClass();
//		System.out.println(info3.isArray()); //⇒ true		
//	}
	
	
	public static void main(String[] args) throws Exception{
		// リスト7-2
//		System.out.println("計算を開始します");
//		System.out.println("計算完了。結果をメモ帳で表示します。");
//		ProcessBuilder pb = new ProcessBuilder("c:\\windows\\system32\\notepad.exe", "calcreport.txt");
//		pb.start();
		
		// リスト7-6
		Class clazz = RefSample.class;
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample) cons.newInstance(256);
		Field f = clazz.getField("times");
		f.set(rs, 2);
		System.out.println(f.get(rs));
		Method m = clazz.getMethod("hello", System.class, int.class);
		m.invoke(rs, "reflection!", 128);
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
		
		
	}
	
	
}

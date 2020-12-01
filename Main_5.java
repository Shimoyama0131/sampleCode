package practice;

public class Main_5 {
	
	// リスト5-1
	// printsメソッド
	// 第1引数の文字列を第2引数の回数だけ表示
	// 第1引数には文字列情報を第2引数には整数を指定
//	public static void prints(Object a, Object b) {
//		for(int i=0; i<(Integer)b; i++) {
//			System.out.println(a);
//		}
//	}
	
	public static void main(String[] args) {
//		Object s = "こんにちは";
//		s = new Hero();
//		Object n = 1;
//		prints(s, n);
		
		// リスト5-3
//		Pocket p = new Pocket();
//		p.put("1192");
//		String s = (String) p.get();
//		System.out.println(s);
		
		// リスト5-6
//		Pocket<String> p = new Pocket<String>();
//		p.put("1192");
//		String s = p.get();
//		System.out.println(s);

		// リスト5-13
		Pocket<Object> pocket = new Pocket<Object>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		pocket.put(new Object(){
			String innerField;
			void innerMethod() {}
		});
		
	}

}

// リスト5-11
//class Outer{
//	int outerField; static int outerStaticField;
//	static class Inner{
//		void innerMethod() {
//			outerStaticField = 10;
//		}
//	}
//	void outerMethod() {
//		Inner ic = new Inner();
//	}
//}
//
//class Main_{
//	public static void main(String[] args) {
//		Outer.Inner ic = new Outer.Inner();
//	}
//}


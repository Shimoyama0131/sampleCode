package practice;

public class Main_1 {
	
	public static void main(String[] args) {
//		// リスト1-1
//		String s1 = "スッキリJava";
//		String s2 = "Java";
//		String s3 = "java";
//		if(s2.equals(s3)) {
//			System.out.println("s2とs3は等しい");
//		}
//		if(s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2とs3はケースを区別しなければ等しい");
//		}
//		System.out.println("s1の長さは"+ s1.length() +"です");
//		if(s1.isEmpty()) {
//			System.out.println("s1は空文字です");
//		}
		
//		// リスト1-2
//		String s1 = "Java and JavaScript";
//		if(s1.contains("Java")) {
//			System.out.println("文字列s1は、Javaを含んでいます。");
//		}
//		if(s1.endsWith("Java")) {
//			System.out.println("文字列s1は、Javaが末尾にあります。");
//		}
//		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
//		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.indexOf("Java"));
		
//		// リスト1-3
//		String s1 = "Java programming";
//		System.out.println("文字列s1の3文字目以降は" + s1.substring(3));
//		System.out.println("文字列s1の3～8文字目は" + s1.substring(3, 8));
		
//		// リスト1-4
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<10000; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
		
//		// リスト1-7
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");
//		for(String w : words) {
//			System.out.println(w + "->");
//		}
		
//		//　リスト1-8
//		String s = "abc,def:ghi";
//		String w = s.replaceAll("[beh]", "X");
//		System.out.println(w); // => aXc,dXf:gXi
		
		// リスト1-9
		final String FORMAT = "%8s %6s 所持金%,5d";
		String s = String.format(FORMAT, getName(), getJob(), getGold());
		System.out.println(s);
	}
	
	static String hero;
	
	public static String getName() {
		return hero;
	}
	
	public static String getJob() {
		return null;
	}
	
	public static int getGold() {
		return 100;
	}
	
	boolean isValidPlayerName(String name) {
//		// リスト1-5 正当なプレイヤー名であるかを判断
//		if(name.length() !=8) {
//			return false;
//		}
//		char first = name.charAt(0);
//		if(!(first>='A' && first<='Z')) {
//			return false;
//		}
//		for(int i=0; i<8; i++) {
//			char c = name.charAt(i);
//			if(!((c>='A' && c<='Z') || (c>='0' && c<='9'))) {
//				return false;
//			}
//		}
//		return true;
		
		// リスト1-6 文字列パターンを用いたプレイヤー名チェック
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}

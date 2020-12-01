package practice;

public class Main_14 {
	public static void main(String[] args) {
		// リスト14-5
//		System.out.println("アサートにわざと失敗させる");
//		assert 1 == 0;
//		System.out.println("正常終了します。");
		
		// リスト14-6
		int age = 33;
		assert(++age >= 20);
		System.out.println("あなたの来年の年齢は" + age);
	}
}

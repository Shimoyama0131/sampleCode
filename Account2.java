package practice;

public class Account2 implements Comparable<Account> {
	// リスト4-7
	int number; // 口座番号
	public int compareTo(Account2 obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
		
	}
	@Override
	public int compareTo(Account arg0) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
}

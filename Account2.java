package practice;

public class Account2 implements Comparable<Account> {
	// ���X�g4-7
	int number; // �����ԍ�
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 0;
	}
	
}

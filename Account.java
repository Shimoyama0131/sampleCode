package practice;

public class Account {
	// ���X�g4-2
//	String accountNo;
//	
//	public boolean equals(Object o) {
//		if(o == this) return true;
//		if(o == null) return false;
//		if(!(o instanceof Account)) return false;
//		Account r = (Account) o;
//		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
//			return false;
//		}
//		return true;
//	}
	
	// ���X�g5-7
//	private String accountNo;
//	private int balance;
//	private String accountType;
//	public Account(String aNo, String aType) {}
	
	// ���X�g5-8
//	private String accountNo;
//	private int balance;
//	private String accountType;
//	public Account(String aNo, String aType) {}
//	
//	public static final int FUTSU = 1;
//	public static final int TOUZA = 2;
//	public static final int TEIKI = 3;
	
	// ���X�g5-10
//	private String accountNo;
//	private int balance;
//	private AccountType accountType;
//	public Account(String aNo, AccountType aType) {}
	
	// ���X�g14-1
//	String owner;
//	int balance;
//	public Account(String owner, int balance) {
//		owner = owner;
//		balance = balance;
//	}
//	public void transfer(Account dest, int amount) {
//		dest.balance += amount;
//		balance -= amount;
//	}
	
	// ���X�g14-4
//	private int balance;
//	public void transfer(Account dest, int amount) {
//		System.out.println("����ɑ����������܂����B");
//		assert this.balance >= 0;
//	}
	
	// ���X�g17-3
//	private int balance;
//	public void setBalance(int x) {
//		if(x < 0) throw new IllegalArgumentException();
//		balance = x;
//	}
	
	// ���X�g17-4
	private int balance;
	public void setBalance(int balance) {
		if(balance < 0) {
			throw new IllegalArgumentException("���̎c�����ݒ肳�ꂻ���ɂȂ�܂���");
		}
		this.balance = balance;
	}
	
}

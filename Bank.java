package practice;

import org.apache.commons.lang3.builder.*;

// 13章_課題13-1　javadocコメントを追加

/**
 * 銀行を表すクラス
 */
public class Bank {
	// 13章_課題13-1
//	/** 銀行の名前 */
//	String name;
//	/** 銀行の住所 */
//	String address;
//	
//	/**
//	 * 口座を追加する 
//	 * @param owner 口座名義人
//	 * @param initialBalance 初期残高
//	 */
//	public void addAccount(String owner, int initialBalance) {}
//	public static void main(String[] args) {
//		System.out.println("試験用のメインメソッドです");
//	}
	
	// 14章_課題14-1 junitをダウンロードできなかったため中止
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		if(newName.length() <= 3) {
			throw new IllegalArgumentException("名前が不正です");
		}
		this.name = newName;
	}
	
	
	// リスト8-2
//	String name;
//	String address;
//	public boolean equals(Object o) {
//		if(o==this) return true;
//		if(o==null) return false;
//		if(!(o instanceof Bank)) return false;
//		Bank r = (Bank) o;
//		if(!this.name.equals(r.name)) return false;
//		if(!this.address.equals(r.address)) return false;
//		return true;
//	}
	
	// リスト8-3
//	String name;
//	String address;
//	public boolean equals(Object o) {
//		return EqualsBuilder.reflectionEquals(this, o);
//	}
	
	// リスト8-4
//	public int hashoCode() {
//		return HashoCodeBuilder.reflectionHashoCode(this);
//	}

}

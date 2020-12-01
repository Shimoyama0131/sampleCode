package practice;

import org.apache.commons.lang3.builder.*;

// 13��_�ۑ�13-1�@javadoc�R�����g��ǉ�

/**
 * ��s��\���N���X
 */
public class Bank {
	// 13��_�ۑ�13-1
//	/** ��s�̖��O */
//	String name;
//	/** ��s�̏Z�� */
//	String address;
//	
//	/**
//	 * ������ǉ����� 
//	 * @param owner �������`�l
//	 * @param initialBalance �����c��
//	 */
//	public void addAccount(String owner, int initialBalance) {}
//	public static void main(String[] args) {
//		System.out.println("�����p�̃��C�����\�b�h�ł�");
//	}
	
	// 14��_�ۑ�14-1 junit���_�E�����[�h�ł��Ȃ��������ߒ��~
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		if(newName.length() <= 3) {
			throw new IllegalArgumentException("���O���s���ł�");
		}
		this.name = newName;
	}
	
	
	// ���X�g8-2
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
	
	// ���X�g8-3
//	String name;
//	String address;
//	public boolean equals(Object o) {
//		return EqualsBuilder.reflectionEquals(this, o);
//	}
	
	// ���X�g8-4
//	public int hashoCode() {
//		return HashoCodeBuilder.reflectionHashoCode(this);
//	}

}

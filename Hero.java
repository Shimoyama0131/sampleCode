package practice;

import java.io.*;

//public class Hero implements Cloneable{
////	3��_�ۑ�3-2�A3-3
//	private String name;
//	public Hero(String name) {this.name = name;}
//	public String getName() {return this.name;}
//	
//	public Hero() {
//		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
//	}
//	
//	public void setName(String string) {
//		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		
//	}
//	
//	public Hero getSword() {
//		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		return null;
//	}
//	public void setSword(Sword s) {
//		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		
//	}
//	
//	// ���X�g10-7
//	public Hero(String name, int hp, int mp) {}
//	
////	// ���X�g4-1
////	private String name;
////	private int hp, mp;
////	
////	public String toString() {
////		return "�E��(���O=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
////	}
//	
//	// ���X�g4-8
//	String names;  // ���O
//	int hp;      // HP
//	int mp;
//	Sword sword; // �������Ă��錕
//	public Hero clone() {
//		Hero result = new Hero(names);
//		result.names = this.names;
//		result.hp = this.hp;
//		result.mp = this.mp;
//		result.sword = this.sword;
//		return result;
//	}
//	
//	// ���X�g10-7
//	public Hero loadHeroFromFile() throws IOException{
//		BufferedReader br = new BufferedReader(new FileReader("c:\\rpgsave.dat"));
//		String name = br.readLine();
//		String hp = br.readLine();
//		String mp = br.readLine();
//		br.close();
//		return new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));
//	}
//}


public class Hero implements Serializable{
	// ���X�g10-8
//	private String name;
//	private int hp;
//	private int mp;
	
	// ���X�g10-10
//	private int hp;
//	private Sword sword;
	
	// ���X�g10-11
	private static final long serialVersionUID = 81923983183821L;
}






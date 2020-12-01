package practice;

import java.io.*;

//public class Hero implements Cloneable{
////	3章_課題3-2、3-3
//	private String name;
//	public Hero(String name) {this.name = name;}
//	public String getName() {return this.name;}
//	
//	public Hero() {
//		// TODO 自動生成されたコンストラクター・スタブ
//	}
//	
//	public void setName(String string) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//	
//	public Hero getSword() {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}
//	public void setSword(Sword s) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//	
//	// リスト10-7
//	public Hero(String name, int hp, int mp) {}
//	
////	// リスト4-1
////	private String name;
////	private int hp, mp;
////	
////	public String toString() {
////		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
////	}
//	
//	// リスト4-8
//	String names;  // 名前
//	int hp;      // HP
//	int mp;
//	Sword sword; // 装備している剣
//	public Hero clone() {
//		Hero result = new Hero(names);
//		result.names = this.names;
//		result.hp = this.hp;
//		result.mp = this.mp;
//		result.sword = this.sword;
//		return result;
//	}
//	
//	// リスト10-7
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
	// リスト10-8
//	private String name;
//	private int hp;
//	private int mp;
	
	// リスト10-10
//	private int hp;
//	private Sword sword;
	
	// リスト10-11
	private static final long serialVersionUID = 81923983183821L;
}






package practice;

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Main_10 {
	// ���X�g10-1
//	public void saveHeroToFile(Hero h) throws IOException{
//		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
//		w.write(h.names + "\n");
//		w.write(h.hp + "\n");
//		w.write(h.mp + "\n");
//		w.flush();
//		w.close();
		
		// ���X�g10-2
//		Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));
//		bw.write(h.names);
//		bw.write(",");
//		bw.write(h.hp);
//		bw.write(",");
//		bw.write(h.mp);	
//	}
	
	// ���X�g10-3
//	public static void main(String[] args) {
//		String s = "�~�i�g,�A�T�J,�X�K����";
//		StringTokenizer st = new StringTokenizer(s, ",");
//		while(st.hasMoreTokens()){
//			String t = st.nextToken();
//			System.out.println(t);
//		}
//	}
	
	public static void main(String[] args) throws Exception{
		// ���X�g10-4
//		Reader fr = new FileReader("c:\\rpgdata.properties");
//		Properties p = new Properties();
//		p.load(fr);
//		String name = p.getProperty("heroName");
//		String strHp = p.getProperty("heroHp");
//		int hp = Integer.parseInt(strHp);
//		System.out.println("�E�҂̖��O�F" + name);
//		System.out.println("�E�҂�HP�F" + hp);
//		fr.close();
		
		// ���X�g10-5
//		Writer fw = new FileWriter("c:\\rpgsave.properties");
//		Properties p = new Properties();
//		p.setProperty("heroName", "�A�T�J");
//		p.setProperty("heroHp", "62");
//		p.setProperty("heroMp", "45");
//		p.store(fw, "�E�҂̏��");
//		fw.close();
		
		// ���X�g10-6
//		InputStream is = new FileInputStream("c:\rpgsave.xml");
//		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
//		Element hero = doc.getDocumentElement();
//		Element weapon = findChildByTag(hero, "weapon");
//		Element power = findChildByTag(weapon, "power");
//		String value = power.getTextContent();
		
		// ���X�g10-9
//		Hero hero1 = new Hero("�~�i�g", 75, 18);
//		FileOutputStream fos= new FileOutputStream("c:\\rpgsave.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(hero1);
//		oos.flush();
//		oos.close();
//		
//		FileInputStream fis = new FileInputStream("c:\\rpgsave.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		Hero hero2 = (Hero) ois.readObject();
//		ois.close();
	}
	
	// ���X�g10-6
	static Element findChildByTag(Element self, String name) throws Exception{
		NodeList child = self.getChildNodes();
		for(int i=0; i<child.getLength(); i++) {
			if(child.item(i) instanceof Element) {
				Element e = (Element) child.item(i);
				if(e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}
	
}

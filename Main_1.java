package practice;

public class Main_1 {
	
	public static void main(String[] args) {
//		// ���X�g1-1
//		String s1 = "�X�b�L��Java";
//		String s2 = "Java";
//		String s3 = "java";
//		if(s2.equals(s3)) {
//			System.out.println("s2��s3�͓�����");
//		}
//		if(s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2��s3�̓P�[�X����ʂ��Ȃ���Γ�����");
//		}
//		System.out.println("s1�̒�����"+ s1.length() +"�ł�");
//		if(s1.isEmpty()) {
//			System.out.println("s1�͋󕶎��ł�");
//		}
		
//		// ���X�g1-2
//		String s1 = "Java and JavaScript";
//		if(s1.contains("Java")) {
//			System.out.println("������s1�́AJava���܂�ł��܂��B");
//		}
//		if(s1.endsWith("Java")) {
//			System.out.println("������s1�́AJava�������ɂ���܂��B");
//		}
//		System.out.println("������s1�ōŏ���Java���o�ꂷ��ʒu��" + s1.indexOf("Java"));
//		System.out.println("������s1�ōŌ��Java���o�ꂷ��ʒu��" + s1.indexOf("Java"));
		
//		// ���X�g1-3
//		String s1 = "Java programming";
//		System.out.println("������s1��3�����ڈȍ~��" + s1.substring(3));
//		System.out.println("������s1��3�`8�����ڂ�" + s1.substring(3, 8));
		
//		// ���X�g1-4
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<10000; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
		
//		// ���X�g1-7
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");
//		for(String w : words) {
//			System.out.println(w + "->");
//		}
		
//		//�@���X�g1-8
//		String s = "abc,def:ghi";
//		String w = s.replaceAll("[beh]", "X");
//		System.out.println(w); // => aXc,dXf:gXi
		
		// ���X�g1-9
		final String FORMAT = "%8s %6s ������%,5d";
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
//		// ���X�g1-5 �����ȃv���C���[���ł��邩�𔻒f
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
		
		// ���X�g1-6 ������p�^�[����p�����v���C���[���`�F�b�N
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}

package practice;

public class Main_5 {
	
	// ���X�g5-1
	// prints���\�b�h
	// ��1�����̕�������2�����̉񐔂����\��
	// ��1�����ɂ͕���������2�����ɂ͐������w��
//	public static void prints(Object a, Object b) {
//		for(int i=0; i<(Integer)b; i++) {
//			System.out.println(a);
//		}
//	}
	
	public static void main(String[] args) {
//		Object s = "����ɂ���";
//		s = new Hero();
//		Object n = 1;
//		prints(s, n);
		
		// ���X�g5-3
//		Pocket p = new Pocket();
//		p.put("1192");
//		String s = (String) p.get();
//		System.out.println(s);
		
		// ���X�g5-6
//		Pocket<String> p = new Pocket<String>();
//		p.put("1192");
//		String s = p.get();
//		System.out.println(s);

		// ���X�g5-13
		Pocket<Object> pocket = new Pocket<Object>();
		System.out.println("�g���̂ẴC���X�^���X�����pocket�ɓ���܂�");
		pocket.put(new Object(){
			String innerField;
			void innerMethod() {}
		});
		
	}

}

// ���X�g5-11
//class Outer{
//	int outerField; static int outerStaticField;
//	static class Inner{
//		void innerMethod() {
//			outerStaticField = 10;
//		}
//	}
//	void outerMethod() {
//		Inner ic = new Inner();
//	}
//}
//
//class Main_{
//	public static void main(String[] args) {
//		Outer.Inner ic = new Outer.Inner();
//	}
//}


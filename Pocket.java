package practice;

// ���X�g5-2
//public class Pocket {
//	private Object data; // �i�[�p�̕ϐ�
//	public void put(Object d) {this.data=d;}
//	public Object get() {return this.data;}
//}

// ���X�g5-4
public class Pocket<E> {
	private E data;
	public void put(E d) {this.data=d;}
	public E get() {return this.data;}
}

// ���X�g5-5
//public class Pocket<String> {
//	private String data; // �i�[�p�̕ϐ�
//	public void put(String d) {this.data=d;}
//	public String get() {return this.data;}
//}
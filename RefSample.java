package practice;

public class RefSample {
	// ���X�g7-6
	public int times = 0;
	public RefSample(int t) {
		this.times=t;
	}
	
	public void hello(String msg) {
		this.hello(msg, this.times);
	}
	
	public void hello(String msg, int t) {
		System.out.println("Hello," + msg + " x" + t);
	}
}

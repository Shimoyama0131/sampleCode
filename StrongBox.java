package practice;

public class StrongBox<E> {
	// 5èÕ_â€ëË5-1
//	private E item;
//	public void put(E i) {
//		this.item = i;
//	}
//	public E get() {
//		return this.item;
//	}
	
	// 5èÕ_â€ëË5-2
	private KeyType keyType;
	private E item;
	private long count;
	public StrongBox(KeyType key) {
		this.keyType = key;
	}
	
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		this.count++;
		switch(this.keyType) {
		case PADLOCK:
			if(count < 1024) return null;
			break;
		case BUTTON:
			if(count < 10000) return null;
			break;
		case DIAL:
			if(count < 30000) return null;
			break;
		case FINGER:
			if(count < 1000000) return null;
			break;
		}
		this.count = 0;
		return this.item;
	}
	
	
	
}

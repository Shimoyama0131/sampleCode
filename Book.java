package practice;

//4èÕ_â€ëË4-1
//import java.util.*;
//
//public class Book {
//	private String title;
//	private Date publishDate;
//	private String comment;
//}

import java.util.*;
import org.apache.commons.lang3.builder.*;

//public class Book implements Comparable<Book> {
//	private String title;
//	private Date publishDate;
//	private String comment;
//	
//	public int hashCode() {
//		int r=1;
//		r=31*r+publishDate.hashCode();
//		r=31*r+title.hashCode();
//		return r;
//	}
//	
//	public boolean equals(Object o) {
//		if(this==o) {
//			return true;
//		}
//		if(o==null) {
//			return false;
//		}
//		if(!(o instanceof Book)) {
//			return false;
//		}
//		Book b = (Book) o;
//		if(!publishDate.equals(b.publishDate)) {
//			return false;
//		}
//		if(!title.equals(b.title)) {
//			return false;
//		}
//		return true;
//	}
//	
//	public int compareTo(Book o) {
//		return this.publishDate.compareTo(o.publishDate);
//	}
//	
//	public Book clone() {
//		Book b = new Book();
//		b.title = this.title;
//		b.comment = this.comment;
//		b.publishDate = (Date) this.publishDate.clone();
//		return b;
//	}
//}

// 8èÕ_â€ëË8-2
public class Book implements Comparable<Book>, Cloneable{
	public int hashoCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	public boolean equls(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}
	
	
}



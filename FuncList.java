package practice;

// 6Í_‰Û‘è6-1A6-2
public class FuncList {
	public static boolean isOdd(int x) {return (x%2==1);}
	public String addNamePrefix(boolean male, String name) {
		if(male == true) {return "Mr."+name;}
		else {return "Ms."+name;}
	}
}

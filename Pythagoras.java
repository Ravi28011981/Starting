package strings;

public class Pythagoras {
	
	
	public static void main(String[] args) {
		int a = 183;
		int b = 199;
		double Churchill = berechneHypothenuse(a,b);
		System.out.print(Churchill);
	}
	
	
	static double berechneHypothenuse(int a, int b) {
		double c2 = a*a+b*b; // noch durch 2
		double c = Math.sqrt(c2);
		return c;
	}

}

package strings;

public class Pali2 {
	public static void main(String[] args) {
		char[] eingabe = {'H','a','l','l','o'};
		char[] Palindrom = {'a','n','n','A'};
		umkehren(Palindrom);	//ruft statische Methode auf
		System.out.println();
		umkehren(eingabe);

	}
	static void umkehren(char[] b) {
		for (int i = b.length-1; i >= 0; i -- ){
			System.out.print(b[i]);
	}
		
	}

}

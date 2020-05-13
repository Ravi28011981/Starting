package string;

import java.util.Scanner;
import java.math.BigInteger;

public class iban {
	public static void main(String[] args) {			//Mainmethode zum aufnehmen der Kontonummer und Bankleitzahl
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben sie ihre Bankleitzahl ein");

		String blz = s.next();

		System.out.println("Bitte geben sie ihre Kontonummer ein");

		String ktoNR = s.next();

		String bI = berechneIBAN(ktoNR, blz);

		System.out.println("DE" + bI + blz + ktoNR);

		s.close();
	}

	public static String berechneIBAN(String ktoNR, String blz) {

		String ktoNR2 = ktoNR;
		while (ktoNR2.length() < 10) {
			ktoNR2 = 0 + ktoNR2;
		}

		String zwE = blz + ktoNR2 + 131400;

		BigInteger bigIntegerzwE = new BigInteger(zwE);

		BigInteger siebenundneunzig = new BigInteger("97");

		BigInteger bI2 = bigIntegerzwE.mod(siebenundneunzig);

		BigInteger achtundneunzig = new BigInteger("98");

		BigInteger bI = achtundneunzig.subtract(bI2);

		System.out.println("Prüfziffer: " + bI.toString());
		if (bI.toString().length() == 1) {
			return 0 + bI.toString();
		}

		else {
			return bI.toString();
		}
	}

}

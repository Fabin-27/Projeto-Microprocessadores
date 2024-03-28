package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite os numeros binarios separados por espaço:");

		String input = sc.nextLine();
		
		if (!input.matches("[01\\s]+")) {
			System.out.println("numero Binario invalido");
			return;
		}

		String[] binaryStrings = input.split(" ");
		

		// DECIMAL
 
		System.out.println("os numeros em decimal são: ");

		for (String binaryString : binaryStrings) {
			int decimal = binaryToDecimal(binaryString);
			System.out.println(binaryString + "--> " + decimal);
		}

		// HEXADECIMAL

		System.out.println("\nos numeros em hexadecimal são: ");

		for (String binaryString : binaryStrings) {
			String hexadecimal = binaryToHexadecimal(binaryString);
			System.out.println(binaryString + "--> " + hexadecimal);
		}

		// OCTAL

		System.out.println("\nos numeros em octal são: ");

		for (String binaryString : binaryStrings) {
			String octal = binaryToOctal(binaryString);
			System.out.println(binaryString + "--> " + octal);
		}

		sc.close();
	}

	public static int binaryToDecimal(String binaryString) {

		int decimal = 0;
		int potencia = 0;
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			int digit = binaryString.charAt(i) - '0';
			decimal += digit * Math.pow(2, potencia);
			potencia++;
		}
		return decimal;
	}

	public static String binaryToHexadecimal(String binaryString) {

		if (!isValidBinary(binaryString)) {
			return "numero Binario invalido";
		}

		while (binaryString.length() % 4 != 0) {
			binaryString = "0" + binaryString;
		}

		StringBuilder hexadecimal = new StringBuilder();
		for (int i = 0; i < binaryString.length(); i += 4) {
			String nibble = binaryString.substring(i, i + 4);
			int decimalValue = Integer.parseInt(nibble, 2);
			String hexDigit = Integer.toHexString(decimalValue).toUpperCase();
			hexadecimal.append(hexDigit);
		}
		return hexadecimal.toString();

	}

	public static boolean isValidBinary(String binaryString) {
		for (int i = 0; i < binaryString.length(); i++) {
			char digit = binaryString.charAt(i);
			if (digit != '0' && digit != '1') {
				return false;
			}
		}
		return true;
	}

	public static String binaryToOctal(String binaryString) {

		if (!isValidBinary(binaryString)) {
			return "numero Binario invalido";
		}

		while (binaryString.length() % 3 != 0) {
			binaryString = "0" + binaryString;
		}

		StringBuilder octal = new StringBuilder();
		for (int i = 0; i < binaryString.length(); i += 3) {
			String group = binaryString.substring(i, i + 3);
			int decimalValue = Integer.parseInt(group, 2);
			String octalDigit = Integer.toOctalString(decimalValue);
			octal.append(octalDigit);
		}
		return octal.toString();

	}

}

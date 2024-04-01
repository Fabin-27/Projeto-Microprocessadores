package application;

import java.util.Scanner;

import entitites.Calculo_decimal;
import entitites.Calculo_hexadecimal;
import entitites.Calculo_octal;

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

		Calculo_decimal cd = new Calculo_decimal();
		
		System.out.println("os numeros em decimal são: ");

		for (String binaryString : binaryStrings) {
			int decimal = cd.binaryToDecimal(binaryString);
			System.out.println(binaryString + "--> " + decimal);
		}

		// HEXADECIMAL
		
		Calculo_hexadecimal ch = new Calculo_hexadecimal();

		System.out.println("\nos numeros em hexadecimal são: ");

		for (String binaryString : binaryStrings) {
			String hexadecimal = ch.binaryToHexadecimal(binaryString);
			System.out.println(binaryString + "--> " + hexadecimal);
		}

		// OCTAL
		
		Calculo_octal co = new Calculo_octal();

		System.out.println("\nos numeros em octal são: ");

		for (String binaryString : binaryStrings) {
			String octal = co.binaryToOctal(binaryString);
			System.out.println(binaryString + "--> " + octal);
		}

		sc.close();
	}

	

}

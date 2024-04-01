package entitites;

public class Calculo_decimal {

	public Calculo_decimal() {

	}

	public int binaryToDecimal(String binaryString) {

		int decimal = 0;
		int potencia = 0;
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			int digit = binaryString.charAt(i) - '0';
			decimal += digit * Math.pow(2, potencia);
			potencia++;
		}
		return decimal;
	}

}

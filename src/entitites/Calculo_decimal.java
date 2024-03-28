package entitites;

public class Calculo_decimal {
	
	private int decimal = 0;
	private int potencia = 0;
	
	public Calculo_decimal() {

	}

	public Calculo_decimal(int decimal, int potencia) {
		super();
		this.decimal = decimal;
		this.potencia = potencia;
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
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

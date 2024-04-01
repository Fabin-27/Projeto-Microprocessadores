package entitites;

public class Calculo_octal extends Calculo_hexadecimal {

	public Calculo_octal() {
		
	}
	
	public String binaryToOctal(String binaryString) {

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

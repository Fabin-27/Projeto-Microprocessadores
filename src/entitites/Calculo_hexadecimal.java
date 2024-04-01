package entitites;

public class Calculo_hexadecimal {

	public Calculo_hexadecimal() {

	}

	public String binaryToHexadecimal(String binaryString) {

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

	public boolean isValidBinary(String binaryString) {
		for (int i = 0; i < binaryString.length(); i++) {
			char digit = binaryString.charAt(i);
			if (digit != '0' && digit != '1') {
				return false;
			}
		}
		return true;
	}

}

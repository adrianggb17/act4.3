
public class password {

	public static boolean passwordValida(String contraseņa) {
		int requisitos = 0;
		int mayus = 0;
		int minus = 0;
		int num = 0;
		for (int i = 0; i < contraseņa.length(); i++) {
			if (Character.isUpperCase(contraseņa.charAt(i))) {
				mayus++;
			}
		} // fin for
		for (int i = 0; i < contraseņa.length(); i++) {
			if (Character.isLowerCase(contraseņa.charAt(i))) {
				minus++;
			}
		} // fin for

		for (int i = 0; i < contraseņa.length(); i++) {
			if (Character.isDigit(contraseņa.charAt(i))) {
				num++;
			}
		} // fin for

		if (mayus >= 1) {
			requisitos++;
		}
		if (minus >= 2) {
			requisitos++;
		}
		if (num >= 1) {
			requisitos++;
		}

		if (requisitos >= 3) {
			return true;
		} else {
			return false;
		}

	}// fin metodo

	public static String generarPassword(int i) {
		String theAlphaNumericS;
		StringBuilder builder;

		theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";

		// Creo StringBuffer
		builder = new StringBuilder(i);

		for (int m = 0; m < i; m++) {

			// Genero numericos
			int myindex = (int) (theAlphaNumericS.length() * Math.random());

			// Aņado caracteres
			builder.append(theAlphaNumericS.charAt(myindex));
		}

		return builder.toString();
	}

}


public class password2 {

	public static boolean passwordValida(String contrase√±a) {
		int requisitos = 0;
		int mayus = 0;
		int minus = 0;
		int special = 0;
		for(int i = 0; i<contraseÒa.length(); i++) {
			if(Character.isUpperCase(contraseÒa.charAt(i))){
				mayus++;
			}
		}//fin for
		for(int i = 0; i<contraseÒa.length(); i++) {
			if(Character.isLowerCase(contraseÒa.charAt(i))){
				minus++;
			}
		}//fin for
		
		for(int i = 0; i<contraseÒa.length(); i++) {
			if(contraseÒa.contains(".") || contraseÒa.contains("_") || contraseÒa.contains("*") || contraseÒa.contains("Ò") || contraseÒa.contains("—")){
				special++;
			}
		}//fin for
		
		if(mayus >=1) {
			requisitos++;
		}
		if(minus >=2) {
			requisitos++;
		}
		if (special >= 1) {
			requisitos++;
		}
		
		if(requisitos >= 3) {
			return true;
		}else {
		return false;
		}

	

	}// fin metodo

	public static String generarPassword(int i) {
		String theAlphaNumericS;
		StringBuilder builder;

		theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ._*Ò—" + "abcdefghijklmnopqrstuvwxyz._*Ò—";

		// Creo StringBuffer
		builder = new StringBuilder(i);

		for (int m = 0; m < i; m++) {

			// Genero numericos
			int myindex = (int) (theAlphaNumericS.length() * Math.random());

			// AÒado caracteres
			builder.append(theAlphaNumericS.charAt(myindex));
		}

		return builder.toString();
	}

}// fin clase

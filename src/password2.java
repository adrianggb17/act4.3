
public class password2 {

	public static boolean passwordValida(String contraseña) {
		int requisitos = 0;
		int mayus = 0;
		int minus = 0;
		int special = 0;
		for(int i = 0; i<contrase�a.length(); i++) {
			if(Character.isUpperCase(contrase�a.charAt(i))){
				mayus++;
			}
		}//fin for
		for(int i = 0; i<contrase�a.length(); i++) {
			if(Character.isLowerCase(contrase�a.charAt(i))){
				minus++;
			}
		}//fin for
		
		for(int i = 0; i<contrase�a.length(); i++) {
			if(contrase�a.contains(".") || contrase�a.contains("_") || contrase�a.contains("*") || contrase�a.contains("�") || contrase�a.contains("�")){
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

		theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ._*��" + "abcdefghijklmnopqrstuvwxyz._*��";

		// Creo StringBuffer
		builder = new StringBuilder(i);

		for (int m = 0; m < i; m++) {

			// Genero numericos
			int myindex = (int) (theAlphaNumericS.length() * Math.random());

			// A�ado caracteres
			builder.append(theAlphaNumericS.charAt(myindex));
		}

		return builder.toString();
	}

}// fin clase

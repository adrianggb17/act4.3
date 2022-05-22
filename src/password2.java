
public class password2 {

	public static boolean passwordValida(String contraseña) {
		int requisitos = 0;
		int mayus = 0;
		int minus = 0;
		int special = 0;
		for(int i = 0; i<contraseña.length(); i++) {
			if(Character.isUpperCase(contraseña.charAt(i))){
				mayus++;
			}
		}//end for
		for(int i = 0; i<contraseña.length(); i++) {
			if(Character.isLowerCase(contraseña.charAt(i))){
				minus++;
			}
		}//end for
		
		for(int i = 0; i<contraseña.length(); i++) {
			if(contraseña.contains(".") || contraseña.contains("_") || contraseña.contains("*") || contraseña.contains("�") || contraseña.contains("�")){
				special++;
			}
		}//end for
		
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

	

	}//end metodo
	public static String generarPassword(int i) {
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ._*��"
                                    + "abcdefghijklmnñopqrstuvwxyz._*��"; 

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 

        return builder.toString(); 
    } 
		


}//end clase


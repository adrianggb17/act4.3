
public class password {

	public static boolean passwordValida(String contrase�a) {
		int requisitos = 0;
		int mayus = 0;
		int minus = 0;
		int num = 0;
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
			if(Character.isDigit(contrase�a.charAt(i))){
				num++;
			}
		}//fin for
		
		if(mayus >=1) {
			requisitos++;
		}
		if(minus >=2) {
			requisitos++;
		}
		if (num >= 1) {
			requisitos++;
		}
		
		if(requisitos >= 3) {
			return true;
		}else {
		return false;
		}

	

	}//fin metodo
	public static String generarPassword(int i) {
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ"
                                    + "abcdefghijklmn�opqrstuvwxyz"+
                                    "0123456789"; 

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
	   
}
	


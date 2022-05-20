
public class password {

	/*public static String NUMEROS = "0123456789";
	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
 
	//
	
	public static String ControlMayusc() {
		return getPassword(MAYUSCULAS,1);
	}
	
	public static String ControlMinuscu() {
		return getPassword(MINUSCULAS,3);
	}
	
	public static String controlNum() {
		return getPassword(NUMEROS, 1);
	}
 
 
	public static String getPassword(int length) {
		return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}
 
	public static String getPassword(String key, int length) {
		String pswd = "";
 
		for (int i = 0; i < length; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	
	public boolean isEsFuerte(String contrasenia,String MAYUSCULAS, String MINUSCULAS, String NUMEROS){
	      char comparar;
	      boolean encontrado=false;
	      boolean cond=false;
	      int contNumeros=0;
	      int contMayus=0;
	      int contMinus=0;
	      int k=0;
	      for(int i=0; i<this.length ;i++){
	         comparar=contrasenia.charAt(i);
	         k=0;
	         encontrado=false;
	         while(!(k==(26-1)) && !(comparar==(MAYUSCULAS[k]))){
	            k++;
	         }
	         if(comparar==(MAYUSCULAS[k])){
	            contMayus++;
	            encontrado=true;
	         }
	         
	         k=0;
	         while(encontrado==false && !(k==(26-1)) && !(comparar==(MINUSCULAS[k]))){
	            k++;
	         }
	         if(comparar==(MINUSCULAS[k])){
	            contMinus++;
	            encontrado=true;
	         }
	         k=0;
	         while(encontrado==false && !(k==(10-1)) && !(comparar==(NUMEROS[k]))){
	            k++;
	         }
	         if(comparar==(NUMEROS[k])){
	            contNumeros++;
	         }
	      }
	      if(contMinus>1 && contMayus>2 && contNumeros>5){
	         cond=true;
	      }
	   
	   return cond;
	   }
	   */
	 private int longitud;
	   private String contrasenia;
	   private final int LONG_DEFUAULT=8;
	   private char [] abecedarioMayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
	   'K', 'L', 'M','N','O','P','Q','R','S','T','U','V','W', 'X','Y','Z'};
	   private char [] abecedarioMinusculas ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
	   'k', 'l', 'm','n','o','p','q','r','s','t','u','v','w', 'x','y','z'};
	   private char[] numeros={'0','1','2','3','4','5','6','7','8','9'};
	   
	   //constructores
	   public Password(){
	      this.longitud=LONG_DEFUAULT;
	      this.contrasenia=contrasenia;
	   }
	   public Password(int longitud){
	      this.longitud=longitud;
	      this.contrasenia=generarPassword(longitud);
	   }
	   //getting
	   public int getLongitud(){
	      return this.longitud;
	   }
	   public String getContrasenia(){
	      return this.contrasenia;
	   }
	   //setting
	   public void setLongitud(int longitud){
	      this.longitud=longitud;
	   }
	   public void setContrasenia(String contrasenia){
	      this.contrasenia=contrasenia;
	   }
	   
	   public String generarPassword(int longitud){
	      int aleatorio,aleatorio1;
	      int contMinusculas=0;
	      int contMayusculas=0;
	      int contNumeros=0;
	      int cont=0;
	      int i=0;
	      int longitudMayusculas=(longitud*3/11);
	      int longitudNumeros=(longitud*6/11);
	      int longitudMinusculas=(longitud-longitudMayusculas-longitudNumeros);
	      StringBuilder str=new StringBuilder();
	      Random rnd=new Random();
	      
	      while(longitud>cont){
	         aleatorio=(int)(rnd.nextDouble()*3);
	         if(aleatorio==0 && contMinusculas<longitudMinusculas){
	            aleatorio1=(int) (rnd.nextDouble()*(abecedarioMinusculas.length-1));
	            str.append(abecedarioMinusculas[aleatorio1]);
	            cont++;
	            contMinusculas++;
	         }
	         if(aleatorio==1 && contMayusculas<longitudMayusculas){
	            aleatorio1=(int) (rnd.nextDouble()*(abecedarioMayusculas.length-1));
	            str.append(abecedarioMayusculas[aleatorio1]);
	            cont++;
	            contMayusculas++;
	         }
	         if(aleatorio==2 && contNumeros<longitudNumeros){
	            aleatorio1=(int) (rnd.nextDouble()*9+0);
	            str.append(aleatorio1);
	            cont++;
	            contNumeros++;
	         }
	         
	      }
	      return str.toString();
	   }
	   
	      public boolean isEsFuerte(String contrasenia){
	          char comparar;
	          boolean encontrado=false;
	          boolean cond=false;
	          int contNumeros=0;
	          int contMayus=0;
	          int contMinus=0;
	          int k=0;
	          for(int i=0; i<this.longitud ;i++){
	             comparar=contrasenia.charAt(i);
	             k=0;
	             encontrado=false;
	             while(!(k==(26-1)) && !(comparar==(abecedarioMayusculas[k]))){
	                k++;
	             }
	             if(comparar==(abecedarioMayusculas[k])){
	                contMayus++;
	                encontrado=true;
	             }
	             
	             k=0;
	             while(encontrado==false && !(k==(26-1)) && !(comparar==(abecedarioMinusculas[k]))){
	                k++;
	             }
	             if(comparar==(abecedarioMinusculas[k])){
	                contMinus++;
	                encontrado=true;
	             }
	             k=0;
	             while(encontrado==false && !(k==(10-1)) && !(comparar==(numeros[k]))){
	                k++;
	             }
	             if(comparar==(numeros[k])){
	                contNumeros++;
	             }
	          }
	          if(contMinus>1 && contMayus>2 && contNumeros>5){
	             cond=true;
	          }
	       
	       return cond;
	       
	    }
	   
	}
	


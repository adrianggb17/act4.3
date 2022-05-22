import java.util.*;

public class princi{
static Scanner sc = new Scanner(System.in);
   public static void main(String[]args){
	   	int longi1,longi2;
	   	String contraseña1,contraseña2;
		System.out.println("Introduce longitud de la contraseña");
		longi1 = sc.nextInt();
		
		contraseña1=password.generarPassword(longi1);
		System.out.println(contraseña1);
		System.out.println(password.passwordValida(contraseña1));
		
		
		System.out.println("Introduce longitud de la contraseña 2");
		longi2 = sc.nextInt();
		
		contraseña2=password2.generarPassword(longi2);
		System.out.println(contraseña2);
		System.out.println(password2.passwordValida(contraseña2));
   }
}
import java.util.*;

public class princi{
static Scanner sc = new Scanner(System.in);
   public static void main(String[]args){
	   	int longi1,longi2;
	   	String contrase�a1,contrase�a2;
		System.out.println("Introduce longitud de la contrase�a");
		longi1 = sc.nextInt();
		
		contrase�a1=password.generarPassword(longi1);
		System.out.println(contrase�a1);
		System.out.println(password.passwordValida(contrase�a1));
		
		
		System.out.println("Introduce longitud de la contrase�a 2");
		longi2 = sc.nextInt();
		
		contrase�a2=password2.generarPassword(longi2);
		System.out.println(contrase�a2);
		System.out.println(password2.passwordValida(contrase�a2));
   }
}
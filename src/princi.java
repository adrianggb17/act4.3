import java.util.*;

public class princi {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int longi1, longi2;
		String contraseņa1, contraseņa2;
		System.out.println("Introduce longitud de la contraseņa");
		longi1 = sc.nextInt();

		contraseņa1 = password.generarPassword(longi1);
		System.out.println(contraseņa1);
		System.out.println(password.passwordValida(contraseņa1));

		System.out.println("Introduce longitud de la contraseņa 2");
		longi2 = sc.nextInt();

		contraseņa2 = password2.generarPassword(longi2);
		System.out.println(contraseņa2);
		System.out.println(password2.passwordValida(contraseņa2));
	}
}
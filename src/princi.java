import java.util.*;
public class princi{
   public static void main(String[]args){
      int numeroDePass;
      Scanner tec=new Scanner(System.in);
      System.out.println("Ingrese el numero de contrase�as a construir");
      numeroDePass=tec.nextInt();
      password pass[]=new password[numeroDePass];
      String cond,fuerte;
      int longitud;
   
      for(int i=0;i<numeroDePass;i++){
         System.out.println("Desea ingresar la longitud de la contrase�a? ");
         cond=tec.next();
         if(cond.toLowerCase().equals("si")){
            System.out.println("Ingrese su longitud y se creara automaticamente su contrase�a ");
            longitud=tec.nextInt();
            pass=new password(longitud);
            
         }else{
            pass=new password();
            System.out.println("Escriba su contrase�a de  8 caracteres:");
            pass.setContrasenia(tec.next());
         }
      }
      for(int i=0;i<numeroDePass;i++){
         if(pass.isEsFuerte(pass.getContrasenia())==true){
            fuerte="fuerte!";
            
         }else{
            fuerte="debil";
         }
         
         System.out.println("la contrase�a N�: "+(i+1)+" es igual a: "+pass.getContrasenia()+" "+" " +fuerte);
         
      }
      
   
   }

}
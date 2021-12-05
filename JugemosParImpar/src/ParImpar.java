
import java.util.Scanner;


public class ParImpar {
 
 public static void main(String[]args){
     int numero;
     Scanner teclado=new Scanner (System.in);
     numero = teclado.nextInt();
     
     if (numero % 2 == 0){
         System.out.println("Es Par");
     }
     else {
         System.out.println("Es Impar");
     }
 }
    
}

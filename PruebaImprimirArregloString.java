package arreglos;
import java.util.Scanner;

public class PruebaImprimirArregloString {

	public static void main(String[] args) 
	{
		
        /* Scanner entrada=new Scanner(System.in); 
		 
		 String palabra;
		 
		 char [] arreglo;
		  
		 System.out.println("INGRESA LA PALABRA Y TE INDICAREMOS SI ES UN PALINDROMO O NO");
		 palabra=entrada.nextLine();
		 arreglo=palabra.toCharArray();*/
		 
		 ImprimirArregloString arreglo=new ImprimirArregloString();
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("INGRESA UNA PALABRA Y TE INDICAREMOS SI ES PALINDORMA O NO");
		 String palabra = scan.nextLine();
		 arreglo.esPalindromo(palabra.toUpperCase());
		 
	
	
	}
	
}

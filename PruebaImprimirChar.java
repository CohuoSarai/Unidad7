package arreglos;

import java.util.Scanner;

public class PruebaImprimirChar {

	public static void main(String[] args) {
		
		  ImprimirArregloChar arreglo=new ImprimirArregloChar();
		  
		  char[] palabra= {'A','N','I','T','A','L','A','V','A','L','A','T','I','N','A'};	
		  char[] palabra2= {'S','A','L','L','A','S'};	
		  
		  arreglo.esPalindromo(palabra);
		  arreglo.esPalindromo(palabra2);
		  
		  String palabra3="SALLAS";
		  String palabra4="ANITALAVALAROPA";
		  
		  Scanner entrada=new Scanner(System.in);
		  String palabras;
		  System.out.println("Introduce una palabra");
		  palabras=entrada.next();
		  
		  System.out.println("La palabra intruducida es "+palabras);

		  

		}

	
}

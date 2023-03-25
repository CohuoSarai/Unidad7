package arreglos;

public class ImprimirArregloString {
	
	public boolean esPalindromo(String palabra) {
		
//		 
		int i = 0;
		int j = palabra.length() - 1;
		for (i = 0; i < (palabra.length() / 2); i++) {
			if (palabra.charAt(i) != palabra.charAt(j)) {
				System.out.println("La palabra no es PALINDROMA");
				return true;
			}
			j--;
		}
		System.out.println("La palabra si es PALINDROMA");
		System.out.println("EL CICLO DIO " + i + " VUELTAS");
		return false;
	}

}

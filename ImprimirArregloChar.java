package arreglos;

public class ImprimirArregloChar {

	//IMPRIMIR ARREGLO
	
		public void imprimirArreglo(char[] arreglo)
	    {
			for(int i=0; i<arreglo.length; i++)
			{
				System.out.println(arreglo[i]);
			}
	    	
	    }
		
		//IMPRIMIR ARREGLO CON VALOR n
		
		public boolean esPalindromo(char[] arreglo)
		  {
			  int i=0;
			  
			  
			  
			  int j=arreglo.length-1;
			  
			
		      for( i=0; i<(arreglo.length/2); i++)
			     {
				   if(arreglo[i]!=arreglo[j])
				    {
					 System.out.println("La palabra no es PALINDROMA");
					 return false;		
			     	}
				    j--;
			     }
				 System.out.println("La palabra si es PALINDROMA");
				 System.out.println("EL CICLO DIO "+i+" VUELTAS");

		    	 return true;	
			}
	
}

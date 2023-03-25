package arreglos;

public class PalabraIgualPalindoma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		char nombre[]= new char[5];
		
		nombre[0]='A';
		nombre[1]='L';
		nombre[2]='A';
		nombre[3]='L';
	    nombre[4]='A';
	    
	    if(nombre[0]==nombre[4]&&nombre[1]==nombre[3])
	    {
	    	System.out.println("La palabra:    "+nombre[0]+nombre[1]+nombre[2]+nombre[3]+nombre[4]+ "   es PALIDROMA");
	    }
	    else
	    {
	    	System.out.println("La palabra:   "+nombre[0]+nombre[1]+nombre[2]+nombre[3]+nombre[4]+ "   no es PALIDROMA");
	    }	
		
	}
	
	public void imprimirArreglo(char[] arreglo)
    {
		for(int i=0; i<arreglo.length; i++)
		{
			System.out.println(arreglo[i]);
		}
    	
    }
	
}

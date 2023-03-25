package arreglos;

public class JuegoGato {

	public boolean ganador(char[][] tablero)
	{
		
		 if (tablero[0][0]==tablero[0][1] && tablero[0][1]==tablero[0][2])
	       {
	    	   System.out.append(tablero[0][0]+" es el ganador1\n");
	    	   return true;
	       }
	       if (tablero[1][0]==tablero[1][1] && tablero[1][1]==tablero[1][2])
	       {
	    	   System.out.append(tablero[1][0]+" es el ganador2\n");
	    	   return true;
	       }
	       if (tablero[2][0]==tablero[2][1] && tablero[2][1]==tablero[2][2])
	       {
	    	   System.out.append(tablero[2][0]+" es el ganador3\n");
	    	   return true;
	       }
	       
	       ///////////////////
	       
	       if (tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2])
	       {
	    	   System.out.append(tablero[1][1]+" es el ganador4\n");
	    	   return true;
	       }
	       if (tablero[2][0]==tablero[1][1] && tablero[1][1]==tablero[0][2])
	       {
	    	   System.out.append(tablero[1][1]+" es el ganador5\n");
	    	   return true;
	       }
	       
	       ///////////////
	      
	       if (tablero[0][0]==tablero[1][0] && tablero[1][0]==tablero[2][0])
	       {
	    	   System.out.append(tablero[0][0]+" es el ganador6\n");
	    	   return true;
	       }
		 if (tablero[0][1]==tablero[1][1] && tablero[1][1]==tablero[2][1])
	       {
	    	   System.out.append(tablero[0][1]+" es el ganador7\n");
	    	   return true;
	       }
		 if (tablero[0][2]==tablero[1][2] && tablero[1][2]==tablero[2][2])
	       {
	    	   System.out.append(tablero[0][2]+" es el ganador8\n");
	    	   return true;
	       }
		 
		 
		 System.out.println("NADIE GANO");
			return false;

	}
	
}

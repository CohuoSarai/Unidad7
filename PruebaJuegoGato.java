package arreglos;

public class PruebaJuegoGato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JuegoGato arreglo=new JuegoGato();
		
		char tablero[][]= {{'X','X','X'},
                           {'O','O','X'},
                           {'X','X','O'}};
		arreglo.ganador(tablero);
		
		
		
	}
	
}

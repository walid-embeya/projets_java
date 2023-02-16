package Modelo;

public class PracticaJuego {

	public static void main(String[] args) {
		System.out.println("******** juego 1 ********");
		juegoConVidas juego1 = new juegoConVidas(5);
		juego1.muestraVidasIniciales();
		juego1.muestraVidasRestantes();
		juego1.quitaVida();
		juego1.actualizaRecord();
		
		System.out.println("\n******** juego 2 ********");
		juegoConVidas juego2 = new juegoConVidas(5);
		juego2.muestraVidasRestantes();
		juego2.quitaVida();
		juego2.quitaVida();
		juego2.actualizaRecord();

	}

}

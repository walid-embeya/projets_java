package Modelo;

public class juegoConVidas {
	private int vidas;     		  //// vidas que tine el jugador
	private int vidasIniciales;   //// vidas initiales
	private static int record = 0;  //// record

	public int getVidas() {
		return vidas;
	}
	public int getVidasIniciales() {
		return vidasIniciales;
	}
	public static int getRecord() {
		return record;
	}
	
	protected void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	protected void setVidasIniciales(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
	}
	protected void setRecord(int record) {
		juegoConVidas.record = record;
	}
	
	//// constructores
	public juegoConVidas(int vidas) {
		this.vidas = vidas;
		vidasIniciales = vidas;  //// aqui no hace falta usar this porque el nombre del atributo es diferente al nombre del parametro
	}
	
//	public juegoConVidas(int vidad, int vidasIniciales, int record) {
//		setVidad(vidad);
//		setVidasIniciales(vidasIniciales);
//		setRecord(record);
//	}
	
	public void muestraVidasIniciales() {
		System.out.println("Vidas iniciales: " + vidasIniciales); 
	}
	
	public void muestraVidasRestantes() {
		System.out.println("Vidas iniciales: " + vidas); 
	}
	
	public boolean quitaVida() {
		
		if (--vidas != 0) {
			System.out.println("vidas restantes: " + vidas);
			return true;
		}
		else {
			System.out.println("Juego Terminado !");
			return false;
		}
		
		//return (vidas>0) ? true : false;
	}
	
	public void reiniciaPartida() {
		vidas = vidasIniciales;
	}
	
	public void actualizaRecord() {
		if (record == vidas) {
			System.out.println("Record Alcanzado !");
		}
		else 
		   if (vidas > record) {
			   record = vidas;
			   System.out.println("Has superado el record. Tu nuevo record es : " + record);
		   }
	}
	

}

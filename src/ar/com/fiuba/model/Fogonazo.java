package ar.com.fiuba.model;

public class Fogonazo implements Ataque {
	
	private final static double POTENCIA = 2;
	private static double CANTIDAD = 4; 
	private final static String NOMBRE = "Fogonazo";

	@Override
	public double getPotencia() {
		return POTENCIA;
	}

	@Override
	public double getCantidad() {
		return CANTIDAD;
	}

	@Override
	public String getNombre() {
		return NOMBRE;
	}

	@Override
	public void disminuirCantidad() {
		this.CANTIDAD -= 1 ;
		
	}

}

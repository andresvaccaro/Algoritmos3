package ar.com.fiuba.model;

public class LatigoCepa implements Ataque {
	
	private final static double POTENCIA = 15;
	private static double CANTIDAD = 10; 
	private final static String NOMBRE = "LatigoCepa";

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

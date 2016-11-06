package ar.com.fiuba.model;

public class Brasas implements Ataque {
	
	private final static double POTENCIA = 16;
	private static double CANTIDAD = 10;
	private final static String NOMBRE = "Brasas";
	
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

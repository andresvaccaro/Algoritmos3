package ar.com.fiuba.model;

public class Canto implements Ataque{
	
	private final static double POTENCIA = 0;
	private static double CANTIDAD = 6; 
	private final static String NOMBRE = "Canto";

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

package ar.com.fiuba.model;

public class Burbuja implements Ataque{
	
	private final static double POTENCIA = 10;
	private static double CANTIDAD = 15;
	private final static String NOMBRE = "Burbuja";

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

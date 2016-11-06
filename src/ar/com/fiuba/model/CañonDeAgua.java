package ar.com.fiuba.model;

public class CaņonDeAgua implements Ataque{

	private final static double POTENCIA = 20;
	private static double CANTIDAD = 8;
	private final static String NOMBRE = "CaņonDeAgua";
	
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

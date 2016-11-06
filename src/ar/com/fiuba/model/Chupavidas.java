package ar.com.fiuba.model;

public class Chupavidas implements Ataque {

	private final static double POTENCIA = 15;
	private static double CANTIDAD = 8;
	private final static String NOMBRE = "Chupavidas";
	
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

package ar.com.fiuba.model;

public class Agua implements ITipoAlgomon {

	@Override
	public double obtenerMultiplicadorParaTipoPlanta() {
		// TODO Auto-generated method stub
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorParaTipoFuego() {
		// TODO Auto-generated method stub
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorParaTipoNormal() {
		// TODO Auto-generated method stub
		return 1d;
	}

	@Override
	public double obtenerMultiplicadorParaTipoAgua() {
		// TODO Auto-generated method stub
		return 0.5d;
	}

}

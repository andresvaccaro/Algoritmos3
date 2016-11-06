package ar.com.fiuba.model;

import java.util.ArrayList;

public class Squirtle extends Algomon{

	private final static double PUNTOS_DE_VIDA_INICIAL = 150d;
	
	public Squirtle() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Agua();
		this.ataques = new ArrayList<Ataque>();
		Ataque burbuja = new Burbuja();
		Ataque caņonDeAgua = new CaņonDeAgua();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(burbuja);
		ataques.add(caņonDeAgua);
		ataques.add(ataqueRapido);
	}
	
	
	
	@Override
	protected void recibirAtaque(Algomon algomonAtacante, Ataque ataque) {
		this.puntosDeVida= this.puntosDeVida - (ataque.getPotencia()* algomonAtacante.getTipoAlgomon().obtenerMultiplicadorParaTipoAgua() );
		
	}
	
	
	public void burbuja(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Burbuja().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void caņonDeAgua(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new CaņonDeAgua().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void ataqueRapido(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new AtaqueRapido().getNombre());
		this.atacar(algomonAtacado, ataque);
	}

	
	
	
}

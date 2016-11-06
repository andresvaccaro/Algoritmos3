package ar.com.fiuba.model;

import java.util.ArrayList;

public class Rattata extends Algomon {

	private final static double PUNTOS_DE_VIDA_INICIAL = 170d;
	
	public Rattata() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Normal();
		this.ataques = new ArrayList<Ataque>();
		Ataque fogonazo = new Fogonazo();
		Ataque burbuja = new Burbuja();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(fogonazo);
		ataques.add(burbuja);
		ataques.add(ataqueRapido);
	}

	@Override
	protected void recibirAtaque(Algomon algomonAtacante, Ataque ataque) {
		this.puntosDeVida= this.puntosDeVida - (ataque.getPotencia()* algomonAtacante.getTipoAlgomon().obtenerMultiplicadorParaTipoNormal() );
		
	}
	
	
	public void fogonazo(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Fogonazo().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void burbuja(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Burbuja().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void ataqueRapido(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new AtaqueRapido().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	
}

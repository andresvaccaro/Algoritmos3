package ar.com.fiuba.model;

import java.util.ArrayList;

public class Charmander extends Algomon {

	private  final static double PUNTOS_DE_VIDA_INICIAL= 170d;
	
	public Charmander() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Fuego();
		this.ataques = new ArrayList<Ataque>();
		Ataque brasas = new Brasas();
		Ataque fogonazo = new Fogonazo();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(brasas);
		ataques.add(fogonazo);
		ataques.add(ataqueRapido);
	}

	@Override
	protected void recibirAtaque(Algomon algomonAtacante, Ataque ataque) {
		this.puntosDeVida= this.puntosDeVida - (ataque.getPotencia()* algomonAtacante.getTipoAlgomon().obtenerMultiplicadorParaTipoFuego() );		
	}
	
	
	public void brasas(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Brasas().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void fogonazo(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Fogonazo().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void ataqueRapido(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new AtaqueRapido().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	

}

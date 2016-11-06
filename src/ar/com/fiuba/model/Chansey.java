package ar.com.fiuba.model;

import java.util.ArrayList;

public class Chansey extends Algomon {

	private final static double PUNTOS_DE_VIDA_INICIAL = 130d;

	public Chansey() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Normal();
		this.ataques = new ArrayList<Ataque>();
		Ataque canto = new Canto();
		Ataque latigoCepa = new LatigoCepa();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(canto);
		ataques.add(latigoCepa);
		ataques.add(ataqueRapido);
	}

	
	@Override
	protected void recibirAtaque(Algomon algomonAtacante, Ataque ataque) {
		this.puntosDeVida= this.puntosDeVida - (ataque.getPotencia()* algomonAtacante.getTipoAlgomon().obtenerMultiplicadorParaTipoNormal() );
	}
	
	
	public void canto(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Canto().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void latigoCepa(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new LatigoCepa().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void ataqueRapido(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new AtaqueRapido().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	
}	

package ar.com.fiuba.model;

import java.util.ArrayList;

public class Bulbasaur extends Algomon {

	private final static double PUNTOS_DE_VIDA_INICIAL = 140d;

	public Bulbasaur() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Planta();
		this.ataques = new ArrayList<Ataque>();
		Ataque chupavidas = new Chupavidas();
		Ataque latigoCepa = new LatigoCepa();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(chupavidas);
		ataques.add(latigoCepa);
		ataques.add(ataqueRapido);
	}

	@Override
	protected void recibirAtaque(Algomon algomonAtacante, Ataque ataque) {
		this.puntosDeVida= this.puntosDeVida - (ataque.getPotencia()* algomonAtacante.getTipoAlgomon().obtenerMultiplicadorParaTipoPlanta() );
	}
	
	public void chupavidas(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Chupavidas().getNombre());
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

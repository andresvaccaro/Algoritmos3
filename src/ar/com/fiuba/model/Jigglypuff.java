package ar.com.fiuba.model;

import java.util.ArrayList;

public class Jigglypuff extends Algomon {

	private  final static double PUNTOS_DE_VIDA_INICIAL= 130d;
	
	public Jigglypuff() {
		super();
		this.puntosDeVida=PUNTOS_DE_VIDA_INICIAL;
		this.tipoAlgomon = new Normal();
		this.ataques = new ArrayList<Ataque>();
		Ataque canto = new Canto();
		Ataque burbuja = new Burbuja();
		Ataque ataqueRapido = new AtaqueRapido();
		ataques.add(canto);
		ataques.add(burbuja);
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
	
	public void burbuja(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new Burbuja().getNombre());
		this.atacar(algomonAtacado, ataque);
	}
	
	public void ataqueRapido(Algomon algomonAtacado){
		Ataque ataque = this.buscarAtaque(new AtaqueRapido().getNombre());
		this.atacar(algomonAtacado, ataque);
	}

}

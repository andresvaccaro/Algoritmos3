package ar.com.fiuba.model;

import java.util.Iterator;
import java.util.List;

public abstract class Algomon {

	protected double puntosDeVida;
	
	protected ITipoAlgomon tipoAlgomon;
	
	protected List<Ataque> ataques;
	
	public void atacar(Algomon algomon){
		
	}

	public void atacar(Algomon algomonAtacado, Ataque ataque) {
		if(ataque.getCantidad() > 0d){
			algomonAtacado.recibirAtaque(this,ataque);
			ataque.disminuirCantidad();
		}
		else{
			throw new SeTerminoLaCantidadDeEsteAtaqueException();
			}		
	}

	protected abstract void recibirAtaque(Algomon algomonAtacante, Ataque ataque) ;
	

	public double getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(double puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public ITipoAlgomon getTipoAlgomon() {
		return tipoAlgomon;
	}

	public void setTipoAlgomon(ITipoAlgomon tipoAlgomon) {
		this.tipoAlgomon = tipoAlgomon;
	}

	protected Ataque buscarAtaque(String nombreAtaque){
		Iterator<Ataque> iterador = ataques.iterator();
		while (iterador.hasNext()){
			Ataque ataque = iterador.next();
			if(ataque.getNombre().equals(nombreAtaque)){
				return ataque;
			}		
		}
		return null;
		
	}

	
	
}

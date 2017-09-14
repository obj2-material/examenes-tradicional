package ar.unq.ciu.basicos;

public class RangoNumerico {

	private int min;
	private int max;
	
	public RangoNumerico(int valorMinimo, int valorMaximo) {
		this.min = valorMinimo;
		this.max = valorMaximo;
	}
	
	public boolean isEnRango(int valor) {
		return min <= valor && valor <= max;
	}

}

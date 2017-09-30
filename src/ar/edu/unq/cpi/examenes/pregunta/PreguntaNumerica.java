package ar.edu.unq.cpi.examenes.pregunta;

import ar.edu.unq.cpi.examenes.respuesta.RespuestaAPregunta;
import ar.edu.unq.cpi.examenes.respuesta.RespuestaNumerica;
import ar.unq.ciu.basicos.RangoNumerico;

public class PreguntaNumerica extends Pregunta {

	private int respuestaCorrecta;
	private RangoNumerico rangoAproximado;
	private int puntajeAproximado;
	
	public PreguntaNumerica(int puntajeMaximo, int respuestaCorrecta) {
		super(puntajeMaximo);
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public void setRangoAproximado(int valorMinimo, int valorMaximo, int puntaje) {
		this.rangoAproximado = new RangoNumerico(valorMinimo, valorMaximo);
		this.puntajeAproximado = puntaje;
	}
	
	public int getRespuestaCorrecta() { return this.respuestaCorrecta; }
	
	public RangoNumerico getRangoAproximado() { return this.rangoAproximado; }
	
	public int getPuntajeAproximado() { return this.puntajeAproximado; }

	@Override
	public RespuestaAPregunta crearRespuesta() { return new RespuestaNumerica(this); }

}

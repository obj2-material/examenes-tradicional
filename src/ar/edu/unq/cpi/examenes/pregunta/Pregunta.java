package ar.edu.unq.cpi.examenes.pregunta;

import ar.edu.unq.cpi.examenes.respuesta.RespuestaAPregunta;

public abstract class Pregunta {

	private int puntajeMaximo;
	
	public Pregunta(int puntajeMaximo) { this.puntajeMaximo = puntajeMaximo; }
	
	public int getPuntajeMaximo() { return this.puntajeMaximo; }

	public abstract RespuestaAPregunta crearRespuesta();
}

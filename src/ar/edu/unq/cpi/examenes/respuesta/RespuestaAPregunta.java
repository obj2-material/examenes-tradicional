package ar.edu.unq.cpi.examenes.respuesta;

import ar.edu.unq.cpi.examenes.pregunta.Pregunta;

public abstract class RespuestaAPregunta {
	public abstract boolean esCorrecta();
	public abstract Pregunta getPregunta();
	
	public int getPuntajeObtenido() { return this.esCorrecta() ? this.getPregunta().getPuntajeMaximo() : 0; }
}

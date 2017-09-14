package ar.edu.unq.cpi.examenes.respuesta;

import ar.edu.unq.cpi.examenes.pregunta.PreguntaMultipleChoice;

public class RespuestaMultipleChoice extends RespuestaAPregunta {

	private PreguntaMultipleChoice preguntaMC;
	private String opcionElegida;
	
	public RespuestaMultipleChoice(PreguntaMultipleChoice pregunta) { this.preguntaMC = pregunta; }
	
	@Override
	public boolean esCorrecta() {
		return this.getPregunta().getOpcionCorrecta().equals(this.getOpcionElegida());
	}
	
	public String getOpcionElegida() { return opcionElegida; }

	@Override
	public PreguntaMultipleChoice getPregunta() { return this.preguntaMC; }

	public void setValor(String valor) { this.opcionElegida = valor; }
}

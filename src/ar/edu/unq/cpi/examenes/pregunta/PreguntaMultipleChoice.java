package ar.edu.unq.cpi.examenes.pregunta;

public class PreguntaMultipleChoice extends Pregunta {

	private String opcionCorrecta;
	
	public PreguntaMultipleChoice(int puntajeMaximo, String opcionCorrecta) {
		super(puntajeMaximo);
		this.opcionCorrecta = opcionCorrecta;
	}

	public String getOpcionCorrecta() { return opcionCorrecta; }
	
	
	
}

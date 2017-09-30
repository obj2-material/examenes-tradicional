package ar.edu.unq.cpi.examenes.pregunta;

import ar.edu.unq.cpi.examenes.respuesta.RespuestaAPregunta;
import ar.edu.unq.cpi.examenes.respuesta.RespuestaMultipleChoice;

public class PreguntaMultipleChoice extends Pregunta {

	private String opcionCorrecta;
	
	public PreguntaMultipleChoice(int puntajeMaximo, String opcionCorrecta) {
		super(puntajeMaximo);
		this.opcionCorrecta = opcionCorrecta;
	}

	public String getOpcionCorrecta() { return opcionCorrecta; }

	@Override
	public RespuestaAPregunta crearRespuesta() {
		return new RespuestaMultipleChoice(this);
	}
	
}

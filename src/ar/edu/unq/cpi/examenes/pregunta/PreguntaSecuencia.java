package ar.edu.unq.cpi.examenes.pregunta;

import java.util.ArrayList;
import java.util.List;

public class PreguntaSecuencia extends Pregunta {

	private List<String> secuenciaCorrecta = new ArrayList<String>();
	
	public PreguntaSecuencia(int puntajeMaximo, List<String> _secuenciaCorrecta) {
		super(puntajeMaximo);
		this.secuenciaCorrecta = _secuenciaCorrecta;
	}
	
	public List<String> getSecuenciaCorrecta() { return this.secuenciaCorrecta; }
}

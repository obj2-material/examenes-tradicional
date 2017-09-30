package ar.edu.unq.cpi.examenes.pregunta;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.examenes.respuesta.RespuestaAPregunta;
import ar.edu.unq.cpi.examenes.respuesta.RespuestaSecuencia;

public class PreguntaSecuencia extends Pregunta {

	private List<String> secuenciaCorrecta = new ArrayList<String>();
	
	public PreguntaSecuencia(int puntajeMaximo, List<String> _secuenciaCorrecta) {
		super(puntajeMaximo);
		this.secuenciaCorrecta = _secuenciaCorrecta;
	}
	
	public List<String> getSecuenciaCorrecta() { return this.secuenciaCorrecta; }
	
	@Override
	public RespuestaAPregunta crearRespuesta() { return new RespuestaSecuencia(this); }
}

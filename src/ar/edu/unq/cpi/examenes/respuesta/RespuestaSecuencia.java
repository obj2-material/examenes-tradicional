package ar.edu.unq.cpi.examenes.respuesta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.unq.cpi.examenes.pregunta.PreguntaSecuencia;

public class RespuestaSecuencia extends RespuestaAPregunta {
	private PreguntaSecuencia preguntaSecuencia;
	private List<String> secuenciaElegida;
	
	@Override
	public boolean esCorrecta() {
		return this.getSecuenciaElegida().equals(this.getPregunta().getSecuenciaCorrecta())
				|| 
				this.getSecuenciaElegidaAlReves().equals(this.getPregunta().getSecuenciaCorrecta());
	}


	public List<String> getSecuenciaElegida() { return this.secuenciaElegida; }
	
	public List<String> getSecuenciaElegidaAlReves() { 
		List<String> nuevaSecuencia = new ArrayList<>(this.secuenciaElegida);
		Collections.reverse(nuevaSecuencia);
		return nuevaSecuencia;
	}

	@Override
	public PreguntaSecuencia getPregunta() { return this.preguntaSecuencia; }

	public void setValor(List<String> valor) { this.secuenciaElegida = valor; }
}

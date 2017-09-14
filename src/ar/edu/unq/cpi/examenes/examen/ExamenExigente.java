package ar.edu.unq.cpi.examenes.examen;

import java.util.Set;

import ar.edu.unq.cpi.examenes.pregunta.Pregunta;

public class ExamenExigente extends Examen {
	protected Set<Pregunta> preguntasImportantes;
	protected int minimoRespuestasImportantesCorrectas;
	
	public Set<Pregunta> getPreguntasImportantes() { return this.preguntasImportantes; }
	
	public int getCantidadRespuestasImportantesCorrectas(ResolucionDeExamen reso) {
		return (int) reso.getRespuestasAPreguntas(this.getPreguntasImportantes())
				.stream()
				.filter(resp -> resp.esCorrecta()).count();
	}

	@Override
	public boolean estaParaAprobar(ResolucionDeExamen resolucion) {
		return super.estaParaAprobar(resolucion) 
				&& this.getCantidadRespuestasImportantesCorrectas(resolucion) >= this.minimoRespuestasImportantesCorrectas;
	}
	
	
}

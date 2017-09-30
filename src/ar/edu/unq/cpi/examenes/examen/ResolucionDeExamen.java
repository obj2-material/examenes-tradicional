package ar.edu.unq.cpi.examenes.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unq.cpi.examenes.pregunta.Pregunta;
import ar.edu.unq.cpi.examenes.respuesta.RespuestaAPregunta;

public class ResolucionDeExamen {
	private List<RespuestaAPregunta> respuestas = new ArrayList<>();
	private Examen examen;
	
	public ResolucionDeExamen(Examen _examen) {
		super();
		this.examen = _examen;
	}
	public List<RespuestaAPregunta> getRespuestas() { return this.respuestas; }
	public void addToRespuestas(RespuestaAPregunta resp) { this.respuestas.add(resp); }
	
	public Examen getExamen() { return this.examen; }
	
	public int getPuntajeObtenido() {
		return this.respuestas.stream().mapToInt(resp -> resp.getPuntajeObtenido()).sum();
	}
	
	public RespuestaAPregunta getRespuestaAPregunta(Pregunta preg) {
		return this.respuestas.stream().filter(resp -> resp.getPregunta().equals(preg)).findAny().get();
	}
	
	public Set<RespuestaAPregunta> getRespuestasAPreguntas(Set<Pregunta> pregs) {
		return this.respuestas.stream().filter(resp -> pregs.contains(resp.getPregunta())).collect(Collectors.toSet());
	}
	
	public boolean estaAprobado() { return this.getExamen().estaParaAprobar(this); }
}

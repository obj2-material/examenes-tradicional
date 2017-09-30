package ar.edu.unq.cpi.examenes.examen;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.examenes.pregunta.Pregunta;

public class Examen {
	private List<Pregunta> preguntas = new ArrayList<Pregunta>();
	private int puntajeMinimoAprobacion;
	
	public List<Pregunta> getPreguntas() { return preguntas; }	
	public void addToPreguntas(Pregunta preg) { preguntas.add(preg); }
	
	public int getPuntajeMaximo() {
		return this.getPreguntas().stream().mapToInt((preg) -> preg.getPuntajeMaximo()).sum();
	}
	
	public int getPuntajeMinimoAprobacion() { return this.puntajeMinimoAprobacion; }
	public void setPuntajeMinimoAprobacion(int puntaje) { this.puntajeMinimoAprobacion = puntaje; }
	
	public boolean estaParaAprobar(ResolucionDeExamen resolucion) {
		return resolucion.getPuntajeObtenido() >= this.getPuntajeMinimoAprobacion();
	}
	
	/* para crear una nueva resolucion en blanco para este examen */
	public ResolucionDeExamen crearResolucion() {
		ResolucionDeExamen reso = new ResolucionDeExamen(this);
		for (Pregunta preg : this.getPreguntas()) {
			reso.addToRespuestas(preg.crearRespuesta());
		}
		return reso;
	}
}

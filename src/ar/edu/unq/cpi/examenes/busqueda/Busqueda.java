package ar.edu.unq.cpi.examenes.busqueda;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unq.cpi.examenes.examen.Examen;
import ar.edu.unq.cpi.examenes.examen.ResolucionDeExamen;

public abstract class Busqueda {
	private Set<Examen> examenes;
	private Set<Aspirante> aspirantes;
	
	public Set<Examen> getExamenes() {
		  return this.examenes;
	}
	public Set<Aspirante> getAspirantes() {
		return this.aspirantes;
	}
	
	public void agregarAspirante(Aspirante aspi) {
		this.aspirantes.add(aspi);
		aspi.setBusqueda(this);
	}
	
	public Set<Aspirante> getAspirantesQueNoSePuedenEvaluar() {
		return this.getAspirantes()
				.stream()
				.filter(asp->asp.getCantidadResoluciones() < this.getExamenes().size())
				.collect(Collectors.toSet());
	}

	public Set<Aspirante> getAspirantesQueSePuedenEvaluar() {
		return this.getAspirantes()
				.stream()
				.filter(asp->asp.getCantidadResoluciones() == this.getExamenes().size())
				.collect(Collectors.toSet());
	}

	public List<Aspirante> getRankingAspirantes() {
		return this.getAspirantesQueCalifican()
				.stream()
				.sorted(Comparator.comparing(Aspirante::getPuntajeTotal))
				.collect(Collectors.toList());
	}
	
	public abstract Collection<Aspirante> getAspirantesQueCalifican();
	
	public Set<ResolucionDeExamen> getRespuestasAExamen(Examen examen) {
		return this.getAspirantesQueRespondieron(examen)
				.stream()
				.map(aspi -> aspi.getResolucion(examen))
				.collect(Collectors.toSet());
	}
	public Set<Aspirante> getAspirantesQueRespondieron(Examen examen) {
		return null;
	}

}

package ar.edu.unq.cpi.examenes.busqueda;

import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unq.cpi.examenes.examen.Examen;
import ar.edu.unq.cpi.examenes.examen.ResolucionDeExamen;

public class Aspirante {

	private Set<ResolucionDeExamen> resoluciones;
	private Busqueda busqueda;
	
	public void registrarResolucion(ResolucionDeExamen resu) { this.resoluciones.add(resu); }
	
	public int getCantidadResoluciones() { return this.resoluciones.size(); }
	
	public int getPuntajeTotal() { 
		return this.resoluciones.stream()
				.mapToInt(reso -> reso.getPuntajeObtenido()).sum(); 
	}
	
	public Set<Examen> getExamenesQueFaltaEntregar() {
		// TODO resolver
		return null;
	}

	public void setBusqueda(Busqueda busq) {
		this.busqueda = busq;		
	}

	public ResolucionDeExamen getResolucion(Examen examen) {
		// TODO Auto-generated method stub
		// este es un find
		return null;
	}
	
	public Set<Examen> getExamenesQueRespondio() {
		return this.resoluciones.stream()
				.map(reso -> reso.getExamen()).collect(Collectors.toSet());
	}

}

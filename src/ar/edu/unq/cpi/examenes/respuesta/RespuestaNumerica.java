package ar.edu.unq.cpi.examenes.respuesta;

import ar.edu.unq.cpi.examenes.pregunta.PreguntaNumerica;

public class RespuestaNumerica extends RespuestaAPregunta {

	private PreguntaNumerica preguntaNumerica;
	private int valor;
	
	@Override
	public boolean esCorrecta() {
		return this.valor == this.getPregunta().getRespuestaCorrecta();
	}

	@Override
	public PreguntaNumerica getPregunta() { return this.preguntaNumerica; }
	
	public int getValor() { return this.valor; }

	public void setValor(int valor) { this.valor = valor; }
}

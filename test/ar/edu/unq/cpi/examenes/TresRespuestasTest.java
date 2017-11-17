package ar.edu.unq.cpi.examenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unq.cpi.examenes.examen.Examen;
import ar.edu.unq.cpi.examenes.examen.ResolucionDeExamen;
import ar.edu.unq.cpi.examenes.pregunta.PreguntaMultipleChoice;
import ar.edu.unq.cpi.examenes.respuesta.RespuestaMultipleChoice;

public class TresRespuestasTest {

	@Test
	public void testPuntaje() {
		RespuestaMultipleChoice resp1 = new RespuestaMultipleChoice(new PreguntaMultipleChoice(5, "c"));
		RespuestaMultipleChoice resp2 = new RespuestaMultipleChoice(new PreguntaMultipleChoice(10, "a"));
		RespuestaMultipleChoice resp3 = new RespuestaMultipleChoice(new PreguntaMultipleChoice(20, "d"));

		ResolucionDeExamen reso = new ResolucionDeExamen(new Examen());
		
		reso.addToRespuestas(resp1);
		reso.addToRespuestas(resp2);
		reso.addToRespuestas(resp3);
		
		resp1.setValor("c");
		resp2.setValor("c");
		resp3.setValor("d");
		
		assertEquals(25, reso.getPuntajeObtenido());
	}

}

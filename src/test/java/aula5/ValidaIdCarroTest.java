package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;


public class ValidaIdCarroTest {

	@Test
	public void testIdValido()  {
		ValidaCarro id = new ValidaCarro();
		int entrada = 1;
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = id.validaIdCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

	@Test
	public void testIdInvalido() {
		ValidaCarro id = new ValidaCarro();
		int entrada = -1;
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = id.validaIdCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
	}

}
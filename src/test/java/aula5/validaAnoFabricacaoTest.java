package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaAnoFabricacaoTest {

	@Test
	public void testAnoFabValida()  {
		ValidaCarro id = new ValidaCarro();
		int entrada = 1981;
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = id.validaAnoFabricacao(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

	@Test
	public void testAnoFabInvalido() {
		ValidaCarro id = new ValidaCarro();
		int entrada = 1980;
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = id.validaAnoFabricacao(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
	}

}
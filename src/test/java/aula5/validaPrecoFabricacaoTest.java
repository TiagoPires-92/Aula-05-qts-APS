package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaPrecoFabricacaoTest {

	@Test
	public void testPrecoFabValida()  {
		ValidaCarro id = new ValidaCarro();
		float entrada = 46000;
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = id.validaPrecoFabricacao(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

	@Test
	public void testPrecoFabInvalido() {
		ValidaCarro id = new ValidaCarro();
		float entrada = 0;
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = id.validaPrecoFabricacao(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
	}

}

package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidaMarcaCarroTest {
	
	@Test
	public void testMarcaValido() {
		ValidaCarro marca = new ValidaCarro();
		String entrada = "GM";
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = marca.validaMarcaCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

	@Test
	public void testMarcaInvalido() {
		ValidaCarro marca = new ValidaCarro();
		String  entrada = "NISSAN";
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = marca.validaMarcaCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
}


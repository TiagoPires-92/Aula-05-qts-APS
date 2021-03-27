package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidaPlacaCarroTest {

	@Test
	public void testPlacaCarroValido() {
		ValidaCarro placa = new ValidaCarro();
		String entrada = "ASD-1H95";
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = placa.validaPlacaCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

	@Test
	public void testPlacaCarroInvalido() {
		ValidaCarro placa = new ValidaCarro();
		String  entrada = "IJAI-2548";
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = placa.validaPlacaCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
}

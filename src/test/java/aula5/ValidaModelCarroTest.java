package aula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidaModelCarroTest {

	@Test
	public void testModeloValido() {
		ValidaCarro modelo = new ValidaCarro();
		String entrada = "Prisma 1.4 Aut";
		boolean resultadoExperado =	true;	
		boolean resultadoPrograma = modelo.validaModelCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
	
	@Test
	public void testModeloInvalido() {
		ValidaCarro modelo = new ValidaCarro();
		String  entrada = "Fiat marea brava tranqueira";
		boolean resultadoExperado =	false;	
		boolean resultadoPrograma = modelo.validaModelCarro(entrada);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
}

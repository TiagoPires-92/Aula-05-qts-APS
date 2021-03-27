package aula5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ validaAnoFabricacaoTest.class, ValidaIdCarroTest.class, ValidaMarcaCarroTest.class,
		ValidaModelCarroTest.class, ValidaPlacaCarroTest.class, validaPrecoFabricacaoTest.class })
public class SuiteTestAula5APS {

}

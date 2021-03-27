package aula5;

public class ValidaCarro { //Nome da sua classe

	//Fun��es dos cd�digos para test!
	
	public boolean validaIdCarro(int id) {            	       
		if(id > 0 ){
			return true;
		}        
		return false;

	}

	public boolean validaModelCarro(String modelo) {            

		if((modelo.length() > 0) && (modelo.length() <= 20)){
			return true;
		}        
		return false;

	}

	public boolean validaMarcaCarro(String marca) {            

		if(marca.equals("VW") || marca.equals("GM") ){
			return true;
		}        
		return false;

	}

	public boolean validaPlacaCarro(String placa) {            

		if(placa.length() == 8) {
			return true;
		}	        
		return false;

	}

	public boolean validaAnoFabricacao(int ano) {            

		if(ano > 1980) {
			return true;
		}        
		return false;	        
	}

	public boolean validaPrecoFabricacao(float valor) {            

		if(valor > 1 && valor < 50000) {
			return true;
		}	        
		return false;	        
	}

}

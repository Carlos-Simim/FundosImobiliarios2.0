package Recursos;

public class DataInvalidaException extends RuntimeException{

	DataInvalidaException(String mensagemErro){
		super(mensagemErro);
	}
	
}

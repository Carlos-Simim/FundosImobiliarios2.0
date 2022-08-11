package Recursos;

@SuppressWarnings("serial")
public class DataInvalidaException extends RuntimeException{

	DataInvalidaException(String mensagemErro){
		super(mensagemErro);
	}
	
}

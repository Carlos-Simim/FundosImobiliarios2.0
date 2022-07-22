package Recursos;
import java.time.LocalDate;

public class Negociacao {

	private LocalDate dataNegociacao; 
	private FundoImobiliario fundoNegociado; 
	private int quantidade;
	private double valorCota; 
	private boolean tipo;
	
	Negociacao(){
		
	}
	
	public Negociacao(LocalDate data, FundoImobiliario fundo, int quantidade, double valor, boolean tipo){
		this.dataNegociacao = data;
		this.fundoNegociado = fundo;
		this.quantidade = quantidade;
		this.valorCota = valor;
		this.tipo = tipo;
		
	}
	
	public double getValorNegociacoes(boolean retorno) {
		double Compra = 0;                           
		double Venda = 0;                            
		
		if(this.getTipo() == true) {
			Compra = Compra + this.valorCota * this.quantidade;
		}else {
			Venda = Venda + this.valorCota * this.quantidade;
		}
		
		if(retorno == true) {
			return Compra;
		}else {
			return Venda;
		}
		
	}
	
	public LocalDate getData() {
		
		return this.dataNegociacao;		
	}

	public boolean getTipo() {
		
		return this.tipo;		
	}
	
	public int getQuantidade() {
		
		return this.quantidade;		
	}
	
	public double getValor() {
		
		return this.valorCota;		
	}
	
	public FundoImobiliario getFundoNegociado() {
		
		return this.fundoNegociado;		
	}
	
	@Override
	public String toString() {
		String retorno;
		
		retorno = "Data: "+this.dataNegociacao+
				" - Fundo: "+this.fundoNegociado.getTicker()+
				" - Quantidade: "+this.quantidade+
				" - Valor: "+this.valorCota+
				" - ";
		
		if (this.tipo == true) {
			retorno = retorno+"Compra";
		}
		if (this.tipo == false) {
			retorno = retorno+"Venda";
		}
		
		return retorno;
	}

}

package Recursos;
import java.time.LocalDate;

public class Negociacao {

	private LocalDate dataNegociacao; 
	private String Ticker; //Ticker
	private int quantidade;
	private double valorCota; //Valor de cada cota
	private boolean tipo; //Compra (true) ou venda (false)
	
	Negociacao(){
		
	}
	
	
	public Negociacao(LocalDate data, String Ticker, int quantidade, double valor, boolean tipo){
		
		this.dataNegociacao = data;
		this.Ticker = Ticker;
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


	public String getTicker() {
		return this.Ticker;
		
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
	
	@Override
	public String toString() {
		String retorno;
		
		retorno = this.dataNegociacao+
				" - "+this.Ticker+
				" - "+this.quantidade+
				" - "+this.valorCota+
				" - ";
		
		if (this.tipo == true) {
			retorno = retorno+"Compra";
		}
		if (this.tipo == false) {
			retorno = retorno+"Venda";
		}
		
		return retorno;
	}
	
//	private LocalDate dataNegociacao; 
//	private String Ticker; //Ticker
//	private int quantidade;
//	private double valorCota; //Valor de cada cota
//	private boolean tipo; //Compra (true) ou venda (false)

}

package Recursos;

import java.time.LocalDate;

public class Rendimento {

	private LocalDate DataPagamento;
	private double ValorPago;
	
	public Rendimento(){

	}
	
	public Rendimento(LocalDate data, double valor) {
		this.DataPagamento = data;
		this.ValorPago = valor;
		
	}
	
	public LocalDate getRendimentoData() {
		if(this.DataPagamento != null) {
				return this.DataPagamento;
		}
		
		return null;
	}
	
	public double getRendimentoValor() {
		
		return this.ValorPago; 	
	}
	
	public void setRendimento(LocalDate data, double valor) {
		this.DataPagamento = data;
		this.ValorPago = valor;
		
	}
	
	@Override
	public String toString() {
		return this.DataPagamento + 
				" - R$"+this.ValorPago;
	}
	
}

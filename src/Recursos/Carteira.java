package Recursos;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carteira{

	private String Proprietario;
	private LocalDate DataCriacao;
	private String Descricao;
	private String Corretora;
	private ArrayList<Negociacao> negociacoes = new ArrayList<Negociacao>();
	protected double taxa;
	
	public Carteira() {
		
	}
	
	public Carteira (String proprietario, String descricao, String corretora, LocalDate data){
		this.Proprietario = proprietario;
		this.DataCriacao = data;
		this.Descricao = descricao;
		this.Corretora = corretora;
		this.taxa = 0;
		
	}
	
	public void setNegociacao (LocalDate data, FundoImobiliario fundo, int quantidade, double valor, boolean tipo)throws DataInvalidaException {
		
		
		if(data.isBefore(LocalDate.now())) {
			throw new DataInvalidaException("Data passada � anterior ao dia de hoje!");
		}else {				
			this.negociacoes.add(new Negociacao(data, fundo, quantidade, valor, tipo));
		}
	}

	public double getTotalNegociacoes(boolean tipo) {
		double total = 0;
		
		for (int i = 0; i < this.negociacoes.size(); i++) {
			if(this.negociacoes.get(i).getTipo() == tipo) {
				total = total + this.negociacoes.get(i).getValorNegociacoes(tipo);
			}
		}
		
		return total;
	}

	public String getDescricao() {
		
		return this.Descricao;
	}
	
	public String getProprietario() {
		
		return this.Proprietario;
	}
	
	public LocalDate getDataCriacao() {
		
		return this.DataCriacao;
	}
	
	public String getCorretora() {
		
		return this.Corretora;
	}
	
	public String listaNegocios() {
		String retorno = "";				
		DecimalFormat df = new DecimalFormat("#,###.######");		
		
		for(int i = 0; i<this.getNegociacoes().size(); i++) {
			retorno = retorno + "\n" + this.getNegociacoes().get(i).toString()
							+" - Taxa: R$"+ df.format(this.getTaxa(i));
										
		}		
		
		return retorno;
	}
	
	public ArrayList<Negociacao> getNegociacoes (){
		
		return this.negociacoes;
	}
	
	public double getTaxa(int i) {
		
		return this.getTaxa(i);
	}
	
	public double getTotalTaxas() {
		double totalTaxas = 0;		
		
		for(int i = 0; i<this.negociacoes.size(); i++) {
			totalTaxas = totalTaxas + this.getTaxa(i);
		}
		
		
		return totalTaxas;
	}
	
	@SuppressWarnings("unchecked")
	public List<Negociacao> getNegociacoesOrdemCronologica (boolean ordemDesejada){
		List<Negociacao> retorno = new ArrayList<Negociacao>();
		retorno = (ArrayList<Negociacao>) this.negociacoes.clone();
		
		if(ordemDesejada == true) {
			Collections.sort(retorno);
		}else {
			Collections.sort(retorno, Collections.reverseOrder());
		}
				
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Propriet�rio: "+this.Proprietario+
				" - Cria��o: "+this.DataCriacao+
				" - Descri��o: "+this.Descricao+
				" - Corretora: "+this.Corretora;
	}

}

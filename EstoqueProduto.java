package model;

public class Produto {
	private String nome;
	private Integer quant;
	private Float valor;
	private Float total;
	private Float precoF;
	
	public String getNome() {	
		return nome;	
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Float getPrecoF() {
		return precoF;
	}
	public void setPrecoF(Float precoF) {
		this.precoF = precoF;
	}
}
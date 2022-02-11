package loja;

import java.math.BigDecimal;

public class Produto {

	String nome;
	BigDecimal preco;
	
	public Produto(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
}

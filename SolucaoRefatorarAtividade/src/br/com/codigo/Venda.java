package br.com.codigo;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Produto> produtos = new ArrayList<Produto>();
	private Double subTotal = 0.0;
	
	public Venda() {}
	
	public void adicionarItem(Produto produto, Integer quantidade){
		this.subTotal += produto.getValor() * quantidade;
		produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
}

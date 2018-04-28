package br.com.codigo;

public class ClienteComum extends Cliente{

	public ClienteComum(String nome, String cpf, String telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	@Override
	public double calculaDesconto(Double subTotal) {
		return 0;
	}

	@Override
	public int getType() {
		return Cliente.COMUM;
	}

	
	
	
}

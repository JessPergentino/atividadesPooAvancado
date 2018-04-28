package br.com.codigo;

public class ClienteEspecial extends Cliente{

	public ClienteEspecial(String nome, String cpf, String telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	@Override
	public double calculaDesconto(Double subTotal) {
		return (subTotal - (subTotal * 0.20));
	}

	@Override
	public int getType() {
		return Cliente.ESPECIAL;
	}
}

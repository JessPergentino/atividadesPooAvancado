package br.com.codigo;

public class Endereco {
	private String endereco;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	
	public Endereco(String endereco, String numero, String complemento, String cidade, String estado) {
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return this.endereco + ", N� " + this.numero + ", " + this.complemento + ", " + this.cidade + ", " + this.estado;
	}
	
}

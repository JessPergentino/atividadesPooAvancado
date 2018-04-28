package br.com.codigo;

public abstract class Cliente {

	static final Integer COMUM = 0;
	static final Integer EXCLUSIVO = 1;
	final static Integer ESPECIAL = 2;
	
	Integer codigo;
	String nome;
	String cpf;
	String telefone;
	Endereco endereco;
	Integer tipo = 0;
	
	public Cliente() {
	
	}
	
	public static Cliente criar(Integer tipo, String nome, String cpf, String telefone, Endereco endereco){
		switch (tipo) {
		case 0:
			return new ClienteComum(nome,cpf,telefone,endereco);
		case 1:
			return new ClienteExclusivo(nome,cpf,telefone,endereco);
		case 2:
			return new ClienteEspecial(nome, cpf,telefone,endereco);
		}
		return null;
	}
	
	public abstract int getType();
	public abstract double calculaDesconto(Double subTotal);

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}

import java.time.LocalDate;

public class Piloto implements Comparable<Piloto>{

	
	private int id;
	private String apelido;
	private Integer numero;
	private String codigo;
	private String nome;
	private String sobrenome;
	private LocalDate nascimento;
	private String nacionalidade;
	private String url;
	
	
	
	
	
	public Piloto(int id, String apelido, Integer numero, String codigo, String nome, String sobrenome, String nacionalidade, String url) {
		this.id = id;
		this.apelido = apelido;
		this.numero = numero;
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.nacionalidade = nacionalidade;
		this.url = url;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Piloto [id=" + id + ", apelido=" + apelido + ", numero=" + numero + ", codigo=" + codigo + ", nome="
				+ nome + ", sobrenome=" + sobrenome + ", nascimento=" + nascimento + ", nacionalidade=" + nacionalidade
				+ ", url=" + url + "]";
	}


	@Override
	public int compareTo(Piloto piloto) {
		return this.getApelido().compareTo(piloto.getApelido());
	}
	
	
	
	
}

package br.edu.ucsal.circulo;

public class Circulo extends Figura {

	private int raio;
	private Ponto origem;

	public Circulo(String cor){
		this.cor = cor;
		
	}
	
	public Circulo(int x, int y, int raio) {
		Ponto o = new Ponto(x, y);
		this.origem = o;
		this.raio = raio;
	}

	public Circulo(Ponto ponto, int raio) {
		Ponto o = new Ponto(ponto.getX(), ponto.getY());
		this.origem = o;
		this.raio = raio;
	}

	public Circulo() {

	}

	public double calcularArea(int raio) {
		double area;

		area = Math.PI * Math.pow(raio, 2);

		return area;
	}

	public double calcularCircunferencia() {
		double circunferencia;

		circunferencia = Math.PI * (2 * raio);
		return circunferencia;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public Ponto getOrigem() {
		return origem;
	}

	public void setOrigem(Ponto origem) {
		this.origem = origem;
	}

	@Override
	public String desenhar() {
		String nomeCor = "Circulo " + cor;
		
		return nomeCor;
	}
	
	@Override
	public String toString() {
		return "Raio= " + this.raio + " Origem= " + this.origem.getX() + " e " + this.origem.getY();
	}

}

package br.edu.ucsal.circulo;

public class Circulo extends Figura {

	private int raio;
	private Ponto origem;


	public Circulo() {
	}
	
	public Circulo(String cor){
		this.cor = cor;
		
	}
	
	// implementa�ao do professor
	public Circulo(int x, int y, int raio) {
		this(new Ponto(x,y),raio); //Reaproveitamento do construtor Circulo(Ponto ponto, int raio)
	}
	
//	public Circulo(int x, int y, int raio) {
//		Ponto o = new Ponto(x, y);
//		this.origem = o;
//		this.raio = raio;
//	}

	// implementa�ao do professor
	public Circulo(Ponto ponto, int raio){
		this.origem = ponto;
		this.raio = raio;
	}
	
//	public Circulo(Ponto ponto, int raio) {
//		Ponto o = new Ponto(ponto.getX(), ponto.getY());
//		this.origem = o;
//		this.raio = raio;
//	}

	// Refatora��o do metodo
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);

	}
	
//	public double calcularArea(int raio) {
//		double area;
//
//		area = Math.PI * Math.pow(raio, 2);
//
//		return area;
//	}

	
	// Refatora��o do Metodo
	public double circunferencia() {
		return 2 * Math.PI * this.raio;
	}
	
	
//	public double calcularCircunferencia() {
//		double circunferencia;
//
//		circunferencia = Math.PI * (2 * raio);
//		return circunferencia;
//	}

	// public int getRaio() {
	// return raio;
	// }
	//
	// public void setRaio(int raio) {
	// this.raio = raio;
	// }
	//
	// public Ponto getOrigem() {
	// return origem;
	// }
	//
	// public void setOrigem(Ponto origem) {
	// this.origem = origem;
	// }

	@Override
	public String desenhar() {
		String nomeCor = "Circulo " + cor;
		return nomeCor;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Circulo : raio: ");
		sb.append(this.raio);
		sb.append(this.origem); // Reutiliza��o do toString do ponto
		return sb.toString();
	}
	
	
//	@Override
//	public String toString() {
//		return "Raio= " + this.raio + " Origem= " + this.origem.getX() + " e " + this.origem.getY();
//	}

}

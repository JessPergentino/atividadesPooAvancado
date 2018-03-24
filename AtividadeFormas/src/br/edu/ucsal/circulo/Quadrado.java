package br.edu.ucsal.circulo;

public class Quadrado extends Figura {

	public Quadrado() {
	}

	public Quadrado(String cor) {
		this.cor = cor;
	}

	// Refatoração do Professor
	@Override
	public String desenhar() {
		return Quadrado.class.getSimpleName() + " " + cor;
	}

	// @Override
	// public String desenhar() {
	// String nomeCor = "Quadrado " + cor;
	// return nomeCor;
	// }

}

package br.edu.ucsal.circulo;

public class Quadrado extends Figura {

	public Quadrado() {
	}

	public Quadrado(String cor) {
		this.cor = cor;
	}

	// Refatora��o do Professor
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

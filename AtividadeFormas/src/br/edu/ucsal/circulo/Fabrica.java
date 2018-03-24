package br.edu.ucsal.circulo;

public class Fabrica {
	// Padrão de Projeto Factory Method
	public static final int QUADRADO = 1;
	public static final int CIRCULO = 2;

	public static Figura criaFigura(int tipo) {
		Figura figura = null;

		switch (tipo) {
		case QUADRADO:
			figura = new Quadrado();
			break;
		case CIRCULO:
			figura = new Circulo();
			break;
		default:
			break;
		}
		return figura;
	}
}

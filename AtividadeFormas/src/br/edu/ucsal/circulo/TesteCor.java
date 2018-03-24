package br.edu.ucsal.circulo;

public class TesteCor {

	public static void main(String[] args) {

		// Figura[] figuras = new Figura[5];
		//
		// figuras[0] = new Quadrado("verde");
		// figuras[1] = new Circulo("amarelo");
		// figuras[2] = new Circulo();
		// figuras[3] = new Quadrado("azul");
		// figuras[4] = new Circulo("preto");

		// Refatoração do Professor
		Figura[] array = { Fabrica.criaFigura(Fabrica.QUADRADO), Fabrica.criaFigura(Fabrica.CIRCULO),
				Fabrica.criaFigura(Fabrica.QUADRADO) };

		for (Figura f : array) {
			System.out.println(f.desenhar());
		}
	}
}

package br.edu.ucsal.circulo;

public class TesteCirculo {

	public static void main(String[] args) {
	
	Ponto p1 = new Ponto(2, 5);
	Circulo cir1 = new Circulo(p1, 4);
	
	Circulo[] circulos = new Circulo[5];
	
	circulos[0] = cir1;
	circulos[1] = new Circulo(new Ponto(1,2), 5);
	circulos[2] = new Circulo(3,4,5);
	circulos[3] = new Circulo(1,1,6);
	circulos[4] = new Circulo(5,5,6);
	
	for (Circulo c : circulos) {
		System.out.println(c);
	}

	}

}

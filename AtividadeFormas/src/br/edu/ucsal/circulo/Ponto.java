package br.edu.ucsal.circulo;

public class Ponto {

	private int x;
	private int y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Por questão de perfomasse é bom utilizar o StringBuilder
	// o stringbuilder gerencia a criação das strings
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Ponto x:");
		sb.append(x);
		sb.append(" y: ");
		sb.append(y);
		return sb.toString();
	}
	
//	@Override
//	public String toString() {
//		return "X=" + this.x + "  Y=" + this.y; 
//	}

	// Não necessariamento sempre é preciso usar os gets e setters, neste caso conseguimos alterar as variaveis com o construtor
	// public int getX() {
	// return x;
	// }
	//
	// public void setX(int x) {
	// this.x = x;
	// }
	//
	// public int getY() {
	// return y;
	// }
	//
	// public void setY(int y) {
	// this.y = y;
	// }

}

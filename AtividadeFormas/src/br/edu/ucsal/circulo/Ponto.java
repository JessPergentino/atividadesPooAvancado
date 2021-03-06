package br.edu.ucsal.circulo;

public class Ponto {

	private int x;
	private int y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "X=" + this.x + "  Y=" + this.y; 
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

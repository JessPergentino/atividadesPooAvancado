package br.edu.ucsal.circulo;

public class Quadrado extends Figura{

	
	public Quadrado(){
		
	}
	
	public Quadrado(String cor){
		this.cor = cor;
	}
	
	@Override
	public String desenhar() {
		String nomeCor = "Quadrado " + cor; 
		return nomeCor;
	}

}

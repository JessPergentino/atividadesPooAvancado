package br.com.atividade.trabalhador;

public class Teste {

	public static void main(String[] args) {
		
		Trabalhador t = new Trabalhador("dvd", 1000);
		Thread thread = new Thread(t);
		thread.start();
		
		TrabalhadorExtends tex = new TrabalhadorExtends("cd", 500);
		tex.start();
		
		TrabalhadorExtends tex2 = new TrabalhadorExtends("disquete", 750);
		tex2.start();
		
		Trabalhador t2 = new Trabalhador("pendrive", 1000);
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		TrabalhadorExtends tex3 = new TrabalhadorExtends("sd", 500);
		tex3.start();
		
		TrabalhadorExtends tex4 = new TrabalhadorExtends("hd", 750);
		tex4.start();
		
	}
}

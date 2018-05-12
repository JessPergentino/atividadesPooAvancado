package br.com.atividade.pilha;

public class Teste {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		Produtor produtor = new Produtor(pilha);
		Produtor produtor2 = new Produtor(pilha);
		Produtor produtor3 = new Produtor(pilha);
		
		Thread thread2 = new Thread(produtor);
		Thread thread3 = new Thread(produtor2);
		Thread thread5 = new Thread(produtor3);
		
		Consumidor consumidor = new Consumidor(pilha);
		Consumidor consumidor2 = new Consumidor(pilha);
		
		Thread thread4 = new Thread(consumidor2);
		Thread thread1 = new Thread(consumidor);
		
		
		
		thread1.start();
		thread4.start();
		
	
		
		
		
		

		
		

	}

}

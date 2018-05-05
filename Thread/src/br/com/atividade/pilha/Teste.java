package br.com.atividade.pilha;

public class Teste {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		Produtor produtor = new Produtor(pilha);
		Thread thread2= new Thread(produtor);
		thread2.start();
		
		Consumidor consumidor = new Consumidor(pilha);
		Thread thread1 = new Thread(consumidor);
		thread1.start();
		
		Produtor produtor2 = new Produtor(pilha);
		Thread thread3= new Thread(produtor2);
		thread3.start();
		
		Consumidor consumidor2 = new Consumidor(pilha);
		Thread thread4 = new Thread(consumidor2);
		thread4.start();
		
		
		
		
		
		

		
		

	}

}

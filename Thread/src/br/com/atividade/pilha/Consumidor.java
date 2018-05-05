package br.com.atividade.pilha;

public class Consumidor implements Runnable{

	private Pilha pilha;
	
	public Consumidor(Pilha pilha) {
		this.pilha = pilha;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println("Usando: " + pilha.pop());
			try {
				Thread.sleep((int) (Math.random() * 5000) );
			} catch (Exception e) {
			}
		}
		
	}

}

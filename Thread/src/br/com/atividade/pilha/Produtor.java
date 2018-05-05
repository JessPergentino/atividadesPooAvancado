package br.com.atividade.pilha;

public class Produtor implements Runnable{

	private Pilha pilha;
	
	public Produtor(Pilha pilha) {
		this.pilha = pilha;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			pilha.push(i);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
			}
		}
		
	}

	
}

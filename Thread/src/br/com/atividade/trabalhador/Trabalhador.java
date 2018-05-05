package br.com.atividade.trabalhador;

public class Trabalhador implements Runnable {

	private String produto;
	private int tempo;
	
	public Trabalhador(String produto, int tempo) {
		this.produto = produto;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Inicio: " + produto);
			try {
				Thread.sleep( (long) (Math.random() * tempo));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " Fim: " + produto);
		}
		
	}

}

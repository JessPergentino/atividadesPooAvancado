package br.com.atividade.pilha;

public class Pilha {

	private int index = 0;
	private int[] buffer = new int[30];
	
	public synchronized int pop() {	
		index--;
		return buffer[index];
	}
	
	public synchronized void push(int i) {
		buffer[index] = i;
		index++;
	}
}

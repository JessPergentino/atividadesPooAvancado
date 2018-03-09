package com.ucsal.atividade;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

public class EntradaTextoVector {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("resouser/results.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha
		List<String> lista = new Vector<>();

		int tamanho = 23778;

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			lista.add(0, s);
			s = br.readLine();
		}
		long fim = System.currentTimeMillis();
		System.out.println("Vector adiciona no começo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			lista.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vector percorrendo: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < tamanho; i++) {
			lista.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vector remove do começo: " + (fim - inicio) / 1000.0);
		br.close();

	}
}

package br.edu.ucsal.formula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LerArquivo {

	public static void main(String[] args) {
		List<Circuito> circuitos = new ArrayList<Circuito>();

		File arquivo = new File("circuits.csv");

		try {
			FileInputStream fileIntuptStream = new FileInputStream(arquivo);
			InputStreamReader inputStreamReader = new InputStreamReader(fileIntuptStream);
			BufferedReader bufferReader = new BufferedReader(inputStreamReader);
			String line = "";
			bufferReader.readLine();
			while ((line = bufferReader.readLine()) != null) {
				String[] array = line.split(",");

				Circuito circuito = new Circuito(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4],
						array[5], array[6], array[7], array[8]);
				circuitos.add(circuito);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(circuitos.size());

		for (Circuito circuito : circuitos) {
			System.out.println(circuito);
		}

		System.out.println();
		
		Collections.sort(circuitos, Collections.reverseOrder());

		for (Circuito circuito : circuitos) {
			System.out.println(circuito);
		}
		
		System.out.println();

		Compare c = new Compare();
		Collections.sort(circuitos, c);

		for (Circuito circuito : circuitos) {
			System.out.println(circuito);
		}

	}

}

class Compare implements Comparator<Circuito> {
	@Override
	public int compare(Circuito o1, Circuito o2) {

		return o1.getRefCircuito().compareTo(o2.getRefCircuito()) * -1;
	}
}

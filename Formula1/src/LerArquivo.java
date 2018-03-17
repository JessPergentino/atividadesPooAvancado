import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LerArquivo {
	
	
	public static void main(String[] args) {
		
		List<Piloto> pilotos = new ArrayList<Piloto>();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		File arquivo = new File("drivers.csv");
		try {
			FileInputStream fileInputStream = new FileInputStream(arquivo);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line = "";
			bufferedReader.readLine();
			while( (line = bufferedReader.readLine()) != null ) {
				String[] array = line.split(",");
			
				Piloto piloto = new Piloto(Integer.parseInt(array[0]), array[1].toUpperCase(), (array[2].length()>0)?Integer.parseInt(array[2]):null, array[3], array[4], array[5],  array[7], array[8]);
				pilotos.add(piloto);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(pilotos.size());
		
		
		for (Piloto piloto : pilotos) {
			System.out.println(piloto);
		}
		
		Collections.sort(pilotos,Collections.reverseOrder());
		
		
		for (Piloto piloto : pilotos) {
			System.out.println(piloto);
		}
		Compare c = new Compare();
		Collections.sort(pilotos, c);
				
		for (Piloto piloto : pilotos) {
			System.out.println(piloto);
		}
		
	}
	
	 
}

class Compare implements Comparator<Piloto> {

	@Override
	public int compare(Piloto o1, Piloto o2) {
		return o1.getApelido().compareTo(o2.getApelido()) * -1;
	}
}




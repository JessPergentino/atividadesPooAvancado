package br.ucsal.atividade.conectar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws Exception, IOException {
		Socket con;
		
		con = new Socket("10.8.173.3", 4444);
		
		Reader r = new InputStreamReader(con.getInputStream());
		Writer w = new OutputStreamWriter(con.getOutputStream());
		
		BufferedReader br = new BufferedReader(r);
		w.write("Ola Servidor \n");
		w.flush();
		
		String s ="";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		con.close();
	}
}

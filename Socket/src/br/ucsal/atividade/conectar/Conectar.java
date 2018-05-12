package br.ucsal.atividade.conectar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Conectar {
	
	public static void main(String[] args) throws IOException {
		ServerSocket escuta = new ServerSocket(4444);
		System.out.println("Servidor no Ar");
		while (true) {
			Socket cliente = escuta.accept();
			System.out.println("Aceitou");
			
			System.out.println(cliente.getPort());
			System.out.println(cliente.getLocalPort());
			
			InputStream comandos = cliente.getInputStream();
			OutputStream dados = cliente.getOutputStream();
			
			Writer w = new OutputStreamWriter(dados);
			Reader r = new InputStreamReader(comandos);
			
			BufferedReader br = new BufferedReader(r);
			String s="";
			s = br.readLine();
			System.out.println(s);
			w.write("Ola Cliente!!" + s + "\n");
			w.flush();
			cliente.close();
		}
		
		
	}
	
}

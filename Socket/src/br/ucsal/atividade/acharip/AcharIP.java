package br.ucsal.atividade.acharip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class AcharIP {

	public static void main(String[] args) {
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String nome = address.getHostName();
			
			System.out.println(ip);
			System.out.println(nome);
			
			System.out.println(InetAddress.getByName("10.8.173.15").getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		Socket con;
		try {
//			Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(InetAddress.getLocalHost(), 4466));
			con = new Socket("www.ucsal.br", 80);
			
			URL url = new URL("");
			
			Reader r = new InputStreamReader(con.getInputStream());
			Writer w = new OutputStreamWriter(con.getOutputStream());
			w.write("GET / HTTP/1.0\\n\n");
			w.flush();
			
			BufferedReader br = new BufferedReader(r);
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			con.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

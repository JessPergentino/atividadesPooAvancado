package br.com.codigo;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua Sem Nome", "4", "Ali do Lado", "Sem Rumo", "Lugar Nenhum");
		Cliente cliente = Cliente.criar(2,"José", "111.111.111-1", "91111-1111", endereco);
		
		Endereco endereco2 = new Endereco("Rua Desconhecida", "2", "Ali na Frente", "Sem Norte", "Nenhum Lugar");
		Cliente cliente2 = Cliente.criar(1,"Maria", "222.222.222-1", "92222-2222", endereco2);
		
		Produto produto1 = new Produto("Produto1", 25.90);
		Produto produto2 = new Produto("Produto2", 30.90);
		Produto produto3 = new Produto("Produto3", 15.90);
		
		Venda venda = new Venda();
		Venda venda2 = new Venda();
		
		venda.adicionarItem(produto1, 2);
		venda.adicionarItem(produto3, 2);
		
		venda2.adicionarItem(produto2, 1);
		venda2.adicionarItem(produto3, 3);
		
		NotaFiscal notaFiscal = new NotaFiscal(cliente, venda);
		notaFiscal.calcularTotal();
		notaFiscal.imprime();
		
		NotaFiscal notaFiscal2 = new NotaFiscal(cliente2, venda2);
		notaFiscal2.calcularTotal();
		notaFiscal2.imprime();
		
		
		
	}

}

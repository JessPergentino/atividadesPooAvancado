package br.com.codigo;

public class NotaFiscal {
	
	private Cliente cliente;
	private Venda venda;
	private Double valorTotal;
	
	public NotaFiscal(Cliente cliente, Venda venda){
		this.cliente = cliente;
		this.venda = venda;
	}
	
	public void calcularTotal(){
		this.valorTotal = cliente.calculaDesconto(venda.getSubTotal());
	}
	
	public void imprime(){
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Endereco: "+ cliente.getEndereco());
		
		System.out.println();
		
		System.out.println("Total Geral: R$ " + venda.getSubTotal());
		System.out.println("Valor a Pagar R$ "+ valorTotal);
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venda getVenda() {
		return venda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}
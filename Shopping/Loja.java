package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private DonoLoja dono;
	private List<Funcionario> funcionarios;
	private List<Produto> produtos;
	private List<Cliente> clientes;
	
	public Loja() {
		// TODO Auto-generated constructor stub;
	}

	public Loja(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<>();
		this.produtos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public DonoLoja getDonoLoja() {
		return dono;
	}

	public void setDonoLoja(DonoLoja dono) {
		this.dono = dono;
	}
	
	public List<Produto> getProduto() {
		return produtos;
	}

	public void setProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void addProdutos(Produto produto) {
		produtos.add(produto);
	}
	
	public void printFuncionarios() {
		System.out.println("\n Segue a relação dos funcionários:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\n INFORMAÇÕES DO FUNCIONÁRIO \n Nome: " + funcionario.getNome() + "\n CPF: " + funcionario.getCpf()
			+ "\n Função: " + funcionario.getFuncao() + "\n Salário: " + funcionario.getSalario() 
			+ "\n Contato: " + funcionario.getContato());
		}
	}
	
	public void printProdutos() {
		System.out.println("\n Segue a relação de Produtos: ");
		for (Produto produto : produtos) {
			System.out.println("\n Produto " + produtos.indexOf(produto) + ":" + "\n Nome: " + produto.getNome() 
			+ "\n Marca: " + produto.getMarca() + "\n Valor: " + produto.getValor());
		}
	}
	
	public void printVendas() {
		System.out.println("\n Segue a relação de Vendas: ");
		for (Cliente cliente : clientes) {
			for (Produto produto : cliente.getCarrinhoDeCompras().getProdutos()) {
				System.out.println("Informações da venda \n" + produto.getNome() + "\n" + produto.getMarca() + "\n " + produto.getValor());
			}
		}
	}
}

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

	public void setProduto(List<Produto> produto) {
		this.produtos = new ArrayList<Produto>();
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = new ArrayList<Cliente>();
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
	
	public void removeProdutos(Produto produto) {
		produtos.remove(produto);
	}
	
	public void printFuncionarios() {
		System.out.println("Segue a relação dos funcionários: \n");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("INFORMAÇÕES DO FUNCIONÁRIO \n Nome: " + funcionario.getNome() + "\n CPF: " + funcionario.getCpf()
			+ "\n Função: " + funcionario.getFuncao() + "\n Salário: " + funcionario.getSalario() 
			+ "\n Contatos: " + funcionario.getContato());
		}
	}
	
	public void printProdutos() {
		System.out.println("Segue a relação de Produtos: \n");
		for (Produto produto : produtos) {
			System.out.println("Produto " + produtos.indexOf(produto) + ":" + "\n Nome: " + produto.getNome() 
			+ "\n Marca: " + produto.getMarca() + "\n Valor: " + produto.getValor());
		}
	}
}
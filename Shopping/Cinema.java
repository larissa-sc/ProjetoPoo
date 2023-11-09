package Shopping;

import java.util.List;

public class Cinema extends Loja{
	public int capacidadeMx;
	
	public Cinema() {
		// TODO Auto-generated constructor stub
	}

	public Cinema(String nome, String cnpj, int capacidadeMx) {
		super(nome, cnpj);
		this.capacidadeMx = capacidadeMx;
	}

	public int getCapacidadeMx() {
		return capacidadeMx;
	}

	public void setCapacidadeMx(int capacidadeMx) {
		this.capacidadeMx = capacidadeMx;
	}
	
	@Override
	public void setClientes(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		super.setClientes(clientes);
	}
	
	@Override
	public void setFuncionarios(List<Funcionario> funcionarios) {
		// TODO Auto-generated method stub
		super.setFuncionarios(funcionarios);
	}
	
	@Override
	public void addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		super.addCliente(cliente);
	}
	
	@Override
	public void addProdutos(Produto produto) {
		// TODO Auto-generated method stub
		super.addProdutos(produto);
	}
	
	@Override
	public void addFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		super.addFuncionario(funcionario);
	}
	
	@Override
	public void printFuncionarios() {
		// TODO Auto-generated method stub
		super.printFuncionarios();
	}
	
	@Override
	public void printProdutos() {
		// TODO Auto-generated method stub
		super.printProdutos();
	}
}

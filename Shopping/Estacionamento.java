package Shopping;

import java.util.List;

public class Estacionamento extends Loja{
	public int capacidadeMx;
	public double pracoPorH;
	
	public Estacionamento() {
		// TODO Auto-generated constructor stub
	}

	public Estacionamento(String nome, String cnpj, int capacidadeMx, double pracoPorH) {
		super(nome, cnpj);
		this.capacidadeMx = capacidadeMx;
		this.pracoPorH = pracoPorH;
	}

	public int getCapacidadeMx() {
		return capacidadeMx;
	}

	public void setCapacidadeMx(int capacidadeMx) {
		this.capacidadeMx = capacidadeMx;
	}

	public double getPracoPorH() {
		return pracoPorH;
	}

	public void setPracoPorH(double pracoPorH) {
		this.pracoPorH = pracoPorH;
	}
	
	@Override
	public void setDonoLoja(DonoLoja dono) {
		// TODO Auto-generated method stub
		super.setDonoLoja(dono);
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

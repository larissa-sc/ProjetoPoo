package Shopping;

import java.util.List;

public class Academia extends Loja{
    private double mensalidade;

    public Academia() {
		// TODO Auto-generated constructor stub
	}
    
	public Academia(String nome, String cnpj, double mensalidade) {
		super(nome, cnpj);
		this.mensalidade = mensalidade;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
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
package Shopping;

public class Funcionario extends Pessoa{
	private String funcao;
	private double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, String cpf, String contato, String funcao, double salario) {
		super(nome, cpf, contato);
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void printDados() {
		System.out.println("Dados do Funcionário: \n" + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Contato: " + this.getContato() + "\n Função: " + this.getFuncao() + "\n Salário: " + this.getSalario);
	}
}

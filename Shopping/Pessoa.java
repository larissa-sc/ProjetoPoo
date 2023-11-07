package Shopping;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String contato;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String cpf, String contato) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getContato() {
		return contato;
	}
	public void setContato1(String contato) {
		this.contato = contato;
	}
	
	abstract void printDados();
}

package Shopping;

public class DonoLoja extends Pessoa{
	public DonoLoja() {
		// TODO Auto-generated constructor stub
	}

	public DonoLoja(String nome, String cpf, String contato) {
		super(nome, cpf, contato);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printDados() {
		System.out.println("Dados do Lojista: \n" + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Contato: " + this.getContato());
	}
}

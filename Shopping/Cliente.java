package Shopping;

public class Cliente extends Pessoa{
	private CarrinhoDeCompras carrinhoDeCompras;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String cpf, String contato) {
		super(nome, cpf, contato);
	}

	public CarrinhoDeCompras getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}

	@Override
	void printDados() {
		System.out.println("Dados do Cliente: \n" + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() + "\n Contato: " + this.getContato());
	}
}

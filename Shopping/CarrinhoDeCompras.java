package Shopping;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		super();
		this.produtos = new ArrayList<>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public double calcularValor() {
		double valorTotal = 0.0;
		for (Produto produto : produtos) {
			valorTotal += produto.getValor();
		}
		return valorTotal;
	}
}

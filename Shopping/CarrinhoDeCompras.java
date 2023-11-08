package Shopping;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private double valorTotal;
	private int qtDoProduto;
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		// TODO Auto-generated constructor stub
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public int getQtDoProduto() {
		return qtDoProduto;
	}

	public void setQtDoProduto(int qtDoProduto) {
		this.qtDoProduto = qtDoProduto;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public double calcularValor() {
		valorTotal = 0.0;
		double valorProduto;
		for (Produto produto : produtos) {
			valorProduto = produto.getValor() * qtDoProduto;
			valorTotal += valorProduto;
		}
		return valorTotal;
	}
}

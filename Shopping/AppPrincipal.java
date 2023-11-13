package Shopping;

import java.util.Scanner;

public class AppPrincipal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Shopping shopping = new Shopping("Shopping Center", "80.077.793/0001-70", "(81) 98888-8888");
		
		Andar subsolo = new Andar("Subsolo");
		Andar terreo = new Andar("Térreo");
		Andar andar1 = new Andar("1º andar");
		shopping.addAndar(subsolo);
		shopping.addAndar(terreo);
		shopping.addAndar(andar1);
		
		Loja loja1 = new Loja("Dafiti", "49.599.494/0001-83");
		Loja loja2 = new Loja("Americanas", "43.093.872/0001-10");
		Estacionamento estacionamento = new Estacionamento("Estacionamento Shopping Center", "80.077.793/0001-70", 2000);
		Academia academia = new Academia("Modelo Fit", "33.618.307/0001-16");
		Cinema cinema = new Cinema("CineDay", "34.841.249/0001-97", 600);
		subsolo.addLoja(estacionamento);
		terreo.addLoja(cinema);
		terreo.addLoja(loja1);
		terreo.addLoja(loja2);
		andar1.addLoja(academia);
		
		DonoLoja dono1 = new DonoLoja("John", "111111", "(81) 93333-3333");
		DonoLoja dono2 = new DonoLoja("Philipp", "123456", "(81) 92222-2222");
		DonoLoja dono3 = new DonoLoja("Beatriz", "246800", "(81) 95555-5555");
		DonoLoja dono4 = new DonoLoja("Luana", "135790", "(81) 97777-7777");
		DonoLoja dono5 = new DonoLoja("Amanda", "333333", "(81) 94444-4444");
		loja1.setDonoLoja(dono1);
		loja2.setDonoLoja(dono2);
		estacionamento.setDonoLoja(dono3);
		academia.setDonoLoja(dono4);
		cinema.setDonoLoja(dono5);
		
		Funcionario funcionario1 = new Funcionario("Carlos", "222222", "c@gmail.com", "Atendente", 1600.0);
		Funcionario funcionario2 = new Funcionario("Ana", "333333", "a@gmail.com", "Atendente", 1600.0);
        Funcionario funcionario3 = new Funcionario("Pedro", "444444", "p@gmail.com", "Atendente", 1600.0);
        Funcionario funcionario4 = new Funcionario("Mariana", "555555", "m@gmail.com", "Atendente", 1600.0);
        Funcionario funcionario5 = new Funcionario("Lucas", "666666", "l@gmail.com", "Operador de Estacionamento", 1500.0);
        Funcionario funcionario6 = new Funcionario("Isabela", "777777", "i@gmail.com", "Recepcionista", 1600.0);
        Funcionario funcionario7 = new Funcionario("Rafael", "888888", "r@gmail.com", "Personal", 1800.0);
        Funcionario funcionario8 = new Funcionario("Julia", "999999", "j@gmail.com", "Atendente", 1600.0);
        loja1.addFuncionario(funcionario1);
        loja1.addFuncionario(funcionario2);
        loja2.addFuncionario(funcionario3);
        loja2.addFuncionario(funcionario4);
        estacionamento.addFuncionario(funcionario5);
        academia.addFuncionario(funcionario6);
        academia.addFuncionario(funcionario7);
        cinema.addFuncionario(funcionario8);
        
        Produto produto1_Dafiti = new Produto("Camiseta", "Nike", 35.50);
        Produto produto2_Dafiti = new Produto("Calça Jeans Azul Claro", "Levi's", 59.0);
        Produto produto3_Dafiti = new Produto("Vestido Florido", "Zara", 70.50);
        Produto produto4_Dafiti = new Produto("Tênis P&B", "FiveBlue", 79.99);
        loja1.addProdutos(produto1_Dafiti);
        loja1.addProdutos(produto2_Dafiti);
        loja1.addProdutos(produto3_Dafiti);
        loja1.addProdutos(produto4_Dafiti);
        
        Produto produto1_Americanas = new Produto("Smartphone", "Samsung", 1500.0);
        Produto produto2_Americanas = new Produto("Barra de chocolate", "Nestlé", 10.0);
        Produto produto3_Americanas = new Produto("Refrigerante 350ml", "Coca-cola", 5.40);
        loja2.addProdutos(produto1_Americanas);
        loja2.addProdutos(produto2_Americanas);
        loja2.addProdutos(produto3_Americanas);
        
        Produto precoEstacionamento = new Produto("Valor do Estacionamento", "Estacionamento", 12.0);
        estacionamento.addProdutos(precoEstacionamento);
        
        Produto mensalidade = new Produto("Mensalidade", "Modelo Fit", 65.0);
        academia.addProdutos(mensalidade);
        
        Produto ingresso = new Produto("Ingresso filme", "CineDay", 14.40);
        Produto pipocaM = new Produto("Pipoca M", "CineDay", 10.0);
        cinema.addProdutos(ingresso);
        cinema.addProdutos(pipocaM);
        
        while(true) {
        	exibirMenu(shopping);
        	String opcao = scanner.nextLine(); // escolher opção do menu
        	
        	if (opcao.equals("1")) { //dono
				exibirMenuLojas();
				String opcaoLoja = scanner.nextLine();
				
				if (opcaoLoja.equals("1")) { //loja1 dafiti dono
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) { // mostrar produtos
						loja1.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) { // mostrar funcionários
						loja1.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) { // mostrar vendas
						if (loja1.getClientes().isEmpty()) {
							System.out.println("\n Não há relatório de vendas. \n");
						}
						else {
							loja1.printVendas();}
					}
					
					else if (opcaoDono.equals("4")) { //retornar ao menu principal
					}
					
					else if (opcaoDono.equals("5")) { // encerrar
						System.out.println("\n Encerrando... \n");
						break;
					}
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("2")) { // loja2 americanas dono
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) { // mostrar produtos
						loja2.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) { // mostrar funcionários
						loja2.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) { // mostrar vendas
						if (loja2.getClientes().isEmpty()) {
							System.out.println("\n Não há relatório de vendas. \n");
						}
						else {
							loja2.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) { // retornar ao menu principal
					}
					
					else if (opcaoDono.equals("5")) { // encerrar
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("3")) { // estacionamento dono
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) { // mostrar produtos
						estacionamento.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) { // mostrar funcionários
						estacionamento.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) { // mostrar vendas
						if (estacionamento.getClientes().isEmpty()) {
							System.out.println("\n Não há relatório de vendas. \n");
						}
						else {
							estacionamento.printVendas();}
					}
					
					else if (opcaoDono.equals("4")) { // retornar ao menu principal
					}
					
					else if (opcaoDono.equals("5")) { // encerrar
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("4")) { // academia dono
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) { // mostrar produtos
						academia.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) { // mostrar funcionários
						academia.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) { // mostrar vendas
						if (academia.getClientes().isEmpty()) {
							System.out.println("\n Não há relatório de vendas. \n");
						}
						else {
							academia.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) { // retornar ao menu principal
					}
					
					else if (opcaoDono.equals("5")) { // encerrar
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("5")) { // cinema dono
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {  // mostrar produtos
						cinema.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {  // mostrar funcionários
						cinema.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {  // mostrar vendas
						if (cinema.getClientes().isEmpty()) {
							System.out.println("\n Não há relatório de vendas. \n");
						}
						else {
							cinema.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {  // retornar ao menu principal
					}
					
					else if (opcaoDono.equals("5")) {  // encerrar
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("6")) {
				}
				
				else if (opcaoLoja.equals("7")) {
					System.out.println("\n Encerrando... \n");
					break;
				}
				
				else {
					System.out.println("\n Opção inválida \n");
				}
			}
        	
        	else if (opcao.equals("2")) {  //funcionario
				exibirMenuLojas();
				String opcaoLoja = scanner.nextLine();
				
				if (opcaoLoja.equals("1")) {  //loja1
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(loja1, scanner);
						exibirMenuFuncionario();
					}
					
					else if (opcaoFuncionario.equals("2")) {
						adicionarProdutoALoja(loja1, scanner);
						exibirMenuFuncionario();
					}
					
					else if (opcaoFuncionario.equals("3")) {
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("2")) {  //loja2
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(loja2, scanner);
					}
					
					else if (opcaoFuncionario.equals("2")) {
						adicionarProdutoALoja(loja2, scanner);
						exibirMenuFuncionario();
					}
					
					else if (opcaoFuncionario.equals("3")) {
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("3")) {  //estacionamento
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(estacionamento, scanner);
					}
					else if (opcaoFuncionario.equals("3")) {
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Você escolheu uma opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("4")) {  //academia
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(academia, scanner);
					}
					
					else if (opcaoFuncionario.equals("2")) {
						adicionarProdutoALoja(academia, scanner);
						exibirMenuFuncionario();
					}
					
					else if (opcaoFuncionario.equals("3")) {
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("5")) {  //cinema
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(cinema, scanner);
					}
					
					else if (opcaoFuncionario.equals("2")) {
						adicionarProdutoALoja(cinema, scanner);
						exibirMenuFuncionario();
					}
					
					else if (opcaoFuncionario.equals("3")) {
						System.out.println("\n Encerrando... \n");
						break;
					}
					
					else {
						System.out.println("\n Opção inválida. \n");
					}
				}
				
				else if (opcaoLoja.equals("6")) {
					exibirMenu(shopping);
				}
				
				else if (opcaoLoja.equals("7")) {
					System.out.println("\n Encerrando... \n");
					break;
				}
			}
        	
        	else if (opcao.equals("3")) {
				System.out.println("\n Encerrando... \n");
				break;
			}
        	
        	else {
				System.out.println("\n Opção Inválida! \n");
			}
        }		
    }
	private static void exibirMenu(Shopping shopping) {
		System.out.println("\n Bem-vindo ao sistema do " + shopping.getNome() + "\n " +
							"\n ---------- Menu Principal ----------" + 
							"\n 1. Entrar como Dono da Loja" +
							"\n 2. Entrar como Funcionário" +
							"\n 3. Sair" + "\n Digite o número da opção escolhida:");
	}
	
	private static void exibirMenuLojas() {
		System.out.println("\n ---------- Menu ----------" + 
							"\n 1. Dafiti" +
							"\n 2. Americanas" +
							"\n 3. Estacionamento" +
							"\n 4. Modelo Fit" + 
							"\n 5. CineDay" +
							"\n 6. Retornar ao Menu Principal" +
							"\n 7. Sair" + "\n Digite o número da opção que você é responsável:");
	}
	
	private static void exibirMenuDono() {
		System.out.println("\n ---------- Menu Loja ----------" + 
							"\n 1. Lista de Produtos" +
							"\n 2. Lista de Funcionários" +
							"\n 3. Lista de Vendas" +
							"\n 4. Retornar ao Menu Principal" +
							"\n 5. Sair" + "\n Digite o número da opção que deseja visualizar:");
	}
	
	private static void exibirMenuFuncionario() {
		System.out.println("\n ---------- Menu Funcionário ----------" + 
							"\n 1. Registrar uma venda" +
							"\n 2. Cadastrar novo produto à loja" +
							"\n 3. Sair" + "\n Digite o número da opção que deseja:");
	}
	//Método para adicionar produtos novos a loja
	
	private static void adicionarProdutoALoja(Loja loja, Scanner scanner) {
		Produto produto = new Produto();
		System.out.println("\n CADASTRO DO PRODUTO \n Nome do produto: ");
		produto.setNome(scanner.nextLine());
		
		System.out.println("\n Marca do produto: ");
		produto.setMarca(scanner.nextLine());
		
		System.out.println("\n Valor do produto: ");
		double valor = scanner.nextDouble();
		produto.setValor(valor);
		
		loja.addProdutos(produto);
		System.out.println("\n Produto cadastrado!" + "\n Nome: " + produto.getNome() + "\n Valor: R$" + produto.getValor());
	    System.out.println("\n Deseja cadastrar mais produtos no estoque? (S/N): ");
	    String respostaP = scanner.next().toUpperCase();
	    if (respostaP.equals("S")) {
	    	adicionarProdutoALoja(loja, scanner);
	    }
	 }
	//Método para adicionar produtos ao carrinho de compras:

	private static void adicionarAoCarrinho(Loja loja, CarrinhoDeCompras carrinho, Scanner scanner) {
	    System.out.println("\n Escolha o número do produto comprado: ");
	    int nProduto = scanner.nextInt();
	    
	    if (nProduto >= 0 && nProduto < loja.getProduto().size()) {
	        Produto produtoSelecionado = loja.getProduto().get(nProduto);
	        carrinho.addProduto(produtoSelecionado);
	        System.out.println("\n Produto adicionado ao carrinho: " + produtoSelecionado.getNome());
	    } else {
	        System.out.println("\n Opção inválida.");
	    }
	}

	// Método para adicionar o carrinho de compras ao cliente:

	private static void adicionarCarrinhoAoCliente(Cliente cliente, CarrinhoDeCompras carrinho) {
	    cliente.setCarrinhoDeCompras(carrinho);
	    System.out.println("\n Carrinho de compras adicionado ao cliente: " + cliente.getNome() + "\n Valor da compra: R$" + carrinho.calcularValor());
	}

	//Método para adicionar o cliente na loja:

	private static void adicionarClienteALoja(Loja loja, Cliente cliente) {
	    loja.addCliente(cliente);
	    System.out.println(" Cliente adicionado à loja: " + cliente.getNome());
	}
	
	private static void adicionarCliente(Loja loja, Scanner scanner) {
		Cliente cliente = new Cliente();
		System.out.println("\n CADASTRO DO CLIENTE \n Nome do Cliente: ");
		cliente.nome = scanner.nextLine();
		
		System.out.println("\n CPF do Cliente: ");
		cliente.cpf = scanner.nextLine();
		
		System.out.println("\n Contato do Cliente: ");
		cliente.contato = scanner.nextLine();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	    while (true) {
	        exibirMenuProdutos(loja);
	        adicionarAoCarrinho(loja, carrinho, scanner);
	        
	        System.out.println("\n Deseja adicionar mais produtos ao carrinho? (S/N): ");
	        String resposta = scanner.next().toUpperCase();
	        if (!resposta.equals("S")) {
	        	carrinho.calcularValor();
	        	break;
	        }
	    }
	    
	    adicionarCarrinhoAoCliente(cliente, carrinho);
	    adicionarClienteALoja(loja, cliente);
	    
	    System.out.println("\n Deseja registrar novas vendas? (S/N): ");
        String resposta2 = scanner.next().toUpperCase();
        if (resposta2.equals("S")) {
        	adicionarCliente(loja, scanner);
        }
	}
	
	//Método para exibir o menu de produtos:

	private static void exibirMenuProdutos(Loja loja) {
	    System.out.println("\n ----------- Menu Produtos ----------");
	    for (Produto produto : loja.getProduto()) {
	        System.out.println("\n " + loja.getProduto().indexOf(produto) + ". " + produto.getNome());
	    }
	}
}

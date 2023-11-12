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
        	exibirMenu();
        	String opcao = scanner.nextLine(); // escolher opção do menu
        	
        	if (opcao.equals("1")) {
				exibirMenuLojas();
				String opcaoLoja = scanner.nextLine();
				
				if (opcaoLoja.equals("1")) {
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {
						loja1.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {
						loja1.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {
						if (loja1.getClientes().isEmpty()) {
							System.out.println("Não há relatório de vendas");
						}
						else {
							loja1.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {
						System.out.println("Encerrando...");
						break;
					}
					
					else {
						System.out.println("Opção inválida");
					}
				}
				
				else if (opcaoLoja.equals("2")) {
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {
						loja2.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {
						loja2.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {
						if (loja1.getClientes().isEmpty()) {
							System.out.println("Não há relatório de vendas");
						}
						else {
							loja2.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {
						System.out.println("Encerrando...");
						break;
					}
					
					else {
						System.out.println("Opção inválida");
					}
				}
				
				else if (opcaoLoja.equals("3")) {
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {
						estacionamento.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {
						estacionamento.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {
						if (estacionamento.getClientes().isEmpty()) {
							System.out.println("Não há relatório de vendas");
						}
						else {
							estacionamento.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {
						System.out.println("Encerrando...");
						break;
					}
					
					else {
						System.out.println("Opção inválida");
					}
				}
				
				else if (opcaoLoja.equals("4")) {
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {
						academia.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {
						academia.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {
						if (academia.getClientes().isEmpty()) {
							System.out.println("Não há relatório de vendas");
						}
						else {
							academia.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {
						System.out.println("Encerrando...");
						break;
					}
					
					else {
						System.out.println("Opção inválida");
					}
				}
				
				else if (opcaoLoja.equals("5")) {
					exibirMenuDono();
					String opcaoDono = scanner.nextLine();
					
					if (opcaoDono.equals("1")) {
						cinema.printProdutos();
					}
					
					else if (opcaoDono.equals("2")) {
						cinema.printFuncionarios();
					}
					
					else if (opcaoDono.equals("3")) {
						if (cinema.getClientes().isEmpty()) {
							System.out.println("Não há relatório de vendas");
						}
						else {
							cinema.printVendas();
						}
					}
					
					else if (opcaoDono.equals("4")) {
						System.out.println("Encerrando...");
						break;
					}
					
					else {
						System.out.println("Opção inválida");
					}
				}
				
				else if (opcaoLoja.equals("6")) {
					System.out.println("Encerrando...");
					break;
				}
				
				else {
					System.out.println("Opção inválida");
				}
			}
        	
        	else if (opcao.equals("2")) {
				exibirMenuLojas();
				String opcaoLoja = scanner.nextLine();
				
				if (opcaoLoja.equals("1")) {
					exibirMenuFuncionario();
					String opcaoFuncionario = scanner.nextLine();
					
					if (opcaoFuncionario.equals("1")) {
						adicionarCliente(loja1, scanner);
					}
				}
			}
        }		
    }
	private static void exibirMenu() {
		System.out.println("---------- Menu Principal ----------" + 
							"\n 1. Entrar como Dono da Loja" +
							"\n 2. Entrar como Funcionário" +
							"\n 3. Entrar como Cliente" +
							"\n 4. Sair" + "\n Digite o número da opção escolhida:");
	}
	
	private static void exibirMenuLojas() {
		System.out.println("---------- Menu ----------" + 
							"\n 1. Dafiti" +
							"\n 2. Americanas" +
							"\n 3. Estacionamento" +
							"\n 4. Modelo Fit" + 
							"\n 5. CineDay" +
							"\n 6. Sair" + "\n Digite o número da opção que você é responsável:");
	}
	
	private static void exibirMenuDono() {
		System.out.println("---------- Menu Loja ----------" + 
							"\n 1. Lista de Produtos" +
							"\n 2. Lista de Funcionários" +
							"\n 3. Lista de Vendas" +
							"\n 4. Sair" + "\n Digite o número da opção que deseja visualizar:");
	}
	
	private static void exibirMenuFuncionario() {
		System.out.println("---------- Menu Loja ----------" + 
							"\n 1. Registrar uma venda" +
							"\n 2. Sair" + "\n Digite o número da opção que deseja:");
	}
	
	private static void adicionarCliente(Loja loja, Scanner scanner) {
		Cliente cliente = new Cliente();
		System.out.println("Nome do Cliente: ");
		cliente.nome = scanner.nextLine();
		
		System.out.println("CPF do Cliente: ");
		cliente.cpf = scanner.nextLine();
		
		System.out.println("Contato do Cliente: ");
		cliente.contato = scanner.nextLine();
		
		loja.addCliente(cliente);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("----------- Menu Produtos ----------");
		for (Produto produto : loja.getProduto()) {
			System.out.println("\n " + loja.getProduto().indexOf(produto) + ". " + produto.getNome());
		}
		while (true) {
			System.out.println("\n Escolha o número do produto comprado: ");
			int nProduto = scanner.nextInt();
			if (nProduto < loja.getProduto().size()) {
				carrinho.addProduto(loja.getProduto().get(nProduto));
				System.out.println("\n Quantidade do produto comprada: ");
				carrinho.setQtDoProduto(scanner.nextInt());
			}
			else {
				break;
			}
			cliente.setCarrinhoDeCompras(carrinho);
		}
	}
}

package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	private String nome;
    	private String cnpj;
    	private String contato;
    	private List<Andar> andares;
	
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	public Shopping(String nome, String cnpj, String contato) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public List<Andar> getAndares() {
		return andares;
	}

	public void setAndares(List<Andar> andares) {
		this.andares = new ArrayList<Andar>();
	}
	
	public void addAndar(Andar andar) {
        andares.add(andar);
    }
}

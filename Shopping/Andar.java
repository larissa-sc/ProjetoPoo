package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Andar {
    private String nome;
    private List<Loja> lojas;

    public Andar(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(List<Loja> lojas) {
        this.lojas = new ArrayList<Loja>();
    }

    public void addLoja(Loja loja) {
        lojas.add(loja);
    }
}

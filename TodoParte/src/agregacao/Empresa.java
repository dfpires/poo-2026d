package agregacao;
import java.util.ArrayList;
public class Empresa {
    private int id;
    private String nome, cnpj;
    private ArrayList freeLancers;

    public Empresa() {
        this.freeLancers = new ArrayList(); // cria espaço na memória
    }

    public Empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.freeLancers = new ArrayList();
    }
    // adiciona um freelancer na empresa
    // percebam que o objeto freeLancer já vem pronto - independência
    public void adicionaFreeLancer(FreeLancer freeLancer){
        this.freeLancers.add(freeLancer);
    }
    // remove um freelancer na empresa
    // percebam que o objeto freeLancer já vem pronto - independência

    public void removeFreeLancer(FreeLancer freeLancer){
        this.freeLancers.remove(freeLancer);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList getFreeLancers() {
        return freeLancers;
    }

    public void setFreeLancers(ArrayList freeLancers) {
        this.freeLancers = freeLancers;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", freeLancers=" + freeLancers +
                '}';
    }
}

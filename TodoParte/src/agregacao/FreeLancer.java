package agregacao;
// objeto-parte
public class FreeLancer {
    private int id;
    private String nome, funcao;

    public FreeLancer() {
    }
    public FreeLancer(int id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
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
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public String toString() {
        return "\nFreeLancer{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}

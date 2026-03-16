package composicao;

import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nome, cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList();
    }
    public Empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList();
    }
    // composição - objeto vem em pedaçõs, precisamos criar e depois inserir no vetor
    public void addFuncionario(int id, String nome, String cpf, String funcao){
        this.funcionarios.add(new Funcionario(id, nome, cpf, funcao));
    }
    public void removeFuncionario(int id){
        // percorrer o vetor
        for(Funcionario obj: this.funcionarios){
            if (obj.getId() == id){
                this.funcionarios.remove(obj);
                return; // sai do método
            }
        }
        System.out.println("Funcionário não encontrado para remoção");
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

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}

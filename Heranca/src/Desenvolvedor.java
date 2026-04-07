public abstract class Desenvolvedor {
    protected String nome;
    protected String linguagem;
    protected float salario;

    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, String linguagem, float salario) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
    public abstract void codar();

    // não pode ser abstrato pois Junior não o implementa
    public double calcularBonus(){
        return this.salario * 0.05;
    }

}
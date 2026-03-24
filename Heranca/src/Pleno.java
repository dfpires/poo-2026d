public class Pleno extends Desenvolvedor{
    private int projEntr;

    public Pleno() {
        super();
    }
    public Pleno(String nome, String linguagem, float salario, int projEntr) {
        super(nome, linguagem, salario);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public void codar(){
        System.out.println("Pleno codando e realizando Code Review");
    }
    @Override
    public double calcularBonus(){

        return super.calcularBonus() + 1000;
    }
    @Override
    public String toString() {
        return "Pleno{" +
               super.toString() +
                ", Qtde de projetos entregues " + projEntr +
                '}';
    }
}

public class TestaDesenvolvedor {

    public static void mostra(Desenvolvedor camaleao){
        camaleao.codar(); // executa o codar() de quem o camameao representa na chamada do método
        // executa o toString() e calcularBonus() de quem o camameao representa na chamada do método
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        // cria um objeto da class Desenvolvedor (classe pai)
        Desenvolvedor camaleao;
        camaleao = new Junior("Fulano", "Java", 5000, "Beltrano");
        mostra(camaleao);
        camaleao = new Pleno("Beltrano", "Java", 10000, 7);
        mostra(camaleao);
        camaleao = new Senior("Ciclano", "Java", 12000, 3000);
        mostra(camaleao);
    }
}

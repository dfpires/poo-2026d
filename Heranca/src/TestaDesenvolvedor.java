import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void mostra(Desenvolvedor camaleao){
        camaleao.codar(); // executa o codar() de quem o camameao representa na chamada do método
        // executa o toString() e calcularBonus() de quem o camameao representa na chamada do método
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }

    public static void main(String[] args) {
        // cria um objeto da class Desenvolvedor (classe pai)

        Junior jr1 = new Junior("Fulano", "Java", 5000, "Beltrano");
        mostra(jr1);
        Pleno pl1 = new Pleno("Beltrano", "Java", 10000, 7);
        mostra(pl1);
        Senior se1 = new Senior("Ciclano", "Java", 12000, 3000);
        mostra(se1);

        // cria um vetor de Desenvolvedor
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        // adicionar os desenvolvedores no array
        desenvolvedores.add(jr1);
        desenvolvedores.add(pl1);
        desenvolvedores.add(se1);

        // exibe codar, calcularBonus e toString de cada desenvolvedor
        for (Desenvolvedor dev : desenvolvedores) {
            mostra(dev);
        }
    }
}

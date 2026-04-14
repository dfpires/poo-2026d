public abstract class ObraArte {
    protected String titulo;
    protected String artista;

    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract String descrever();

    @Override
    public String toString() {
        return "Título: " + titulo + " | Artista: " + artista + " | Detalhes: " + descrever();
    }
}

// Subclasse Pintura
class Pintura extends ObraArte {
    private String tecnica;

    public Pintura(String titulo, String artista, String tecnica) {
        super(titulo, artista);
        this.tecnica = tecnica;
    }

    @Override
    public String descrever() {
        return "Pintura feita em técnica: " + tecnica;
    }
    @Override
    public String toString(){
        return super.toString() + "Técnica " + this.tecnica;
    }
}

// Subclasse Escultura
class Escultura extends ObraArte {
    private String material;

    public Escultura(String titulo, String artista, String material) {
        super(titulo, artista);
        this.material = material;
    }

    @Override
    public String descrever() {
        return "Escultura esculpida em " + material;
    }
    @Override
    public String toString(){
        return super.toString() + "Material " + this.material;
    }
}

// Subclasse Instalacao
class Instalacao extends ObraArte {
    private boolean interativa;

    public Instalacao(String titulo, String artista, boolean interativa) {
        super(titulo, artista);
        this.interativa = interativa;
    }

    @Override
    public String descrever() {
        return "Instalação " + (interativa ? "interativa" : "não interativa");
    }
    @Override
    public String toString(){
        return super.toString() + "Interativa " + this.interativa;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
    private String nome;
    private List<ObraArte> obras;

    public Exposicao(String nome) {
        this.nome = nome;
        this.obras = new ArrayList<>();
    }

    public void addObra(ObraArte obra) {
        this.obras.add(obra);
    }

    public void exibirObras() {
        System.out.println("--- Lista de Obras da Exposição ---");
        for (ObraArte obra : obras) {
            // Chamada polimórfica: o Java decide qual toString/descrever chamar
            System.out.println(obra.toString());
        }
    }

    public void resumo() {
        System.out.println("Exposição: " + nome);
        System.out.println("Total de obras: " + obras.size());
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando a Exposição
        Exposicao galeria = new Exposicao("Arte Moderna em Franca");

        // Criando as obras (Polimorfismo: tipo ObraArte referenciando subclasses)
        ObraArte p1 = new Pintura("O Grito", "Edvard Munch", "óleo sobre tela");
        ObraArte e1 = new Escultura("Davi", "Michelangelo", "mármore");
        ObraArte i1 = new Instalacao("Labirinto de Luz", "Ana Luz", true);

        // Agregação: Adicionando à exposição
        galeria.addObra(p1);
        galeria.addObra(e1);
        galeria.addObra(i1);

        // Executando os métodos
        galeria.resumo();
        System.out.println();
        galeria.exibirObras();
    }
}
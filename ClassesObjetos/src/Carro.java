public class Carro{
    // criando variáveis com visibilidade pública
    // qualquer outra classe pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia;
    public int ano;

    // método construtor
    public Carro(String marca, String modelo, float potencia, int ano, String placa, String cor){
        this.marca = marca; this.modelo = modelo;
        this.potencia = potencia; this.ano = ano;
        this.placa = placa; this.cor = cor;
    }
    // converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca " + this.marca +
                " Modelo " + this.modelo +
                " Placa " + this.placa +
                " Ano " + this.ano;
    }
}
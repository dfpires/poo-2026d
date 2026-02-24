package exe0;

public class Carro{
    // criando variáveis com visibilidade pública
    // qualquer outra classe pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia, velocidade;
    public int ano;
    public boolean motor; // true se ligado e false se desligado

    // método construtor
    public Carro(String marca, String modelo, float potencia, int ano, String placa, String cor){
        this.marca = marca; this.modelo = modelo;
        this.potencia = potencia; this.ano = ano;
        this.placa = placa; this.cor = cor;
        this.motor = false; this.velocidade = 0;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor) { // desligado
            this.motor = true;
            System.out.println("Motor foi ligado");
        }
    }
    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor foi desligado");
        }
    }

    // acelerar o carro de X unidades
    public void acelerar(float x){
        if (this.motor) {
            this.velocidade += x;
            System.out.println("carro acelerado, valor atual " + this.velocidade);
        }
        else System.out.println("Não foi possível acelerar");
    }
    // frear
    public void frear(float x){
        if (this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("carro freado, valor atual " + this.velocidade);
        }
        else System.out.println("Não foi possível frear");
    }
    // converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca " + this.marca +
                " Modelo " + this.modelo +
                " Placa " + this.placa +
                " Ano " + this.ano +
                " Motor: " + // operador ternário
                (this.motor ? "Ligado" : "Desligado") +
                " Velocidade: " + this.velocidade;
    }
}
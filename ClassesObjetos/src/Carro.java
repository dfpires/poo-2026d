public class Carro{
    // criando variáveis com visibilidade pública
    // qualquer outra classe pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia;
    public int ano;

    // converte o objeto em String
    public String toString(){
        return " Marca " + marca +
                " Modelo " + modelo +
                " Placa " + placa +
                " Ano " + ano;
    }
}
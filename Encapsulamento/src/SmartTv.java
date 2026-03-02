//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class SmartTv {
    private String marca, modelo;
    private int volume;
    // construtor sem parâmetros
    public SmartTv(){
        this.volume = 0;
    }
    // construtor com parâmetro
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca; this.modelo = modelo;
        this.volume = volume;
    }
    // altera o valor de volume
    public void setVolume (int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    // obter o valor do volume
    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public String toString(){
        return "Marca: " + this.marca +
        " Modelo " + this.modelo +
        " Volume: " + this.volume;
    }
}
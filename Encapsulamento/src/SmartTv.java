//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;

    // construtor sem parâmetros
    public SmartTv() {
        this.marca = "indefinido";
        this.modelo = "indefinido";
        this.volume = 0;
        this.conectadoInternet = false;
    }

    // construtor com parâmetro
    public SmartTv(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
        this.conectadoInternet = false;
    }

    // altera o valor de volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("Volume inválido");
    }

    // obter o valor do volume
    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }
    // aumentar o volume
    public void aumentaVolume(int x){
        this.setVolume(this.volume + x);
    }
    public void diminuiVolume(int x){
        this.setVolume(this.volume - x);
    }
    // método público para entrar no YouTube
    public void entrarYouTube() {
        if (this.conectaInternet()){
            System.out.println("Abrindo YouTube");
        }
        else {
            System.out.println("Internet não encontrada");
        }
    }
    // método privado que liga à Internet
    private boolean conectaInternet(){
          System.out.println("Buscando sinal de wi-fi");
          System.out.println("Verificando as credenciais");
          System.out.println("Autenticando IP no roteador");
        // liga a SmartTv na Internet
        int randomico = (int) (Math.random() * 10); // gera número entre 0 e 9
        System.out.println(randomico);
        if (randomico < 5){
            this.conectadoInternet = true;
            return true;
        }
        else {
            this.conectadoInternet = false;
            return false;
        }
    }
    public String toString(){
        return "Marca: " + this.marca +
        " Modelo " + this.modelo +
        " Volume: " + this.volume;
    }
}
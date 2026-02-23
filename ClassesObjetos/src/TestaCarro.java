public class TestaCarro {
    public static void main(String args[]){
        // instância obj1
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.potencia = 1.6f; // f força virar float
        obj1.ano = 2020;
        obj1.placa = "A";
        obj1.cor = "Azul";
        System.out.println(obj1.toString());
        Carro obj2 = new Carro();
        Carro obj3 = new Carro();
    }
}

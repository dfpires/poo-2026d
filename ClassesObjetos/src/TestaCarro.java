public class TestaCarro {
    public static void main(String args[]){
        // instância obj1
        Carro obj1 = new Carro("Fiat", "Palio", 1.6f, 2020, "A", "Azul");
        System.out.println(obj1.toString());

        Carro obj2 = new Carro();
        obj2.marca = "Fiat";
        obj2.modelo = "Palio";
        obj2.potencia = 1.6f; // f força virar float
        obj2.ano = 2020;
        obj2.placa = "A";
        obj2.cor = "Azul";
        System.out.println(obj2.toString());
        Carro obj3 = new Carro();
        obj3.marca = "Fiat";
        obj3.modelo = "Palio";
        obj3.potencia = 1.6f; // f força virar float
        obj3.ano = 2020;
        obj3.placa = "A";
        obj3.cor = "Azul";
        System.out.println(obj3.toString());
    }
}

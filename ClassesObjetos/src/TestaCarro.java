public class TestaCarro {
    public static void main(String args[]){
        // instância obj1
        Carro obj1 = new Carro("Fiat", "Palio", 1.6f, 2020, "A", "Azul");
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("GM", "Onix", 1.3f, 2021, "B", "Preto");
        System.out.println(obj2.toString());
        obj2.ligar();
        System.out.println(obj2.toString());

        Carro obj3 = new Carro("Volks", "Gol", 1.0f, 2022, "C", "Branco");
        System.out.println(obj3.toString());
        obj3.ligar();
        System.out.println(obj3.toString());
    }
}

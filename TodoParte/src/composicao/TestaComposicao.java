package composicao;

public class TestaComposicao {
    public static void main(String[] args){
        Empresa em1 = new Empresa(1, "Banco Master", "1234");

        em1.addFuncionario(10, "Fulano", "456", "MKT");
        em1.addFuncionario(11, "Beltrano", "789", "TI");
        em1.addFuncionario(12, "Ciclano", "0123", "Contador");

        System.out.println(em1.toString());
        em1.removeFuncionario(11);
        System.out.println(em1.toString());
    }
}

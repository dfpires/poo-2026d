public class Checkout {
    public static void main(String[] args){
        // variável do tipo interface
        Pagamento seletor;
        // cliente escolheu PIX
        seletor = new Pix("dfpires@gmail.com");
        seletor.autorizar(150.0); // polimorfismo
        seletor.exibirComprovante();

        // cliente mudou de ideia e escolheu cartão
        seletor = new CartaoCredito("1111222233334444");
        seletor.autorizar(300.0);
        seletor.exibirComprovante(); // polimorfismo
    }
}

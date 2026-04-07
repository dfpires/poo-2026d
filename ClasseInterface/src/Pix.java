public class Pix implements Pagamento{
    private String chavePix;
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QR Code para a chave " + this.chavePix);
        System.out.println("Pagamento de R$ " + valor + " recebido instantaneamente");
    }
    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no App do banco");
    }
}

public class CartaoCredito implements Pagamento{
    private String numeroCartao;
    public CartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    @Override
    public void autorizar(double valor) {
        System.out.println("Verificando limite do cartão " + this.numeroCartao);
        System.out.println("Pagamento de R$ " + valor + " autorizado via crédito");
    }
    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante enviado para o seu email cadastrado ");
    }
}

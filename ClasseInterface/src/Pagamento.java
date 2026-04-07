public interface Pagamento {
    // Contrato: quem implementar, deve oferecer os métodos abaixo
    public void autorizar(double valor);
    public void exibirComprovante();
}
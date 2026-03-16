package exe1;

public class TestaLoja {
    public static void main(String[] args) {
        // Parte 3: Criando 3 produtos independentes
        Produto p1 = new Produto(1, "Mouse Gamer", 150.0f);
        Produto p2 = new Produto(2, "Teclado Mecânico", 350.0f);
        Produto p3 = new Produto(3, "Monitor 24pol", 900.0f);

        // Criando o carrinho
        Carrinho meuCarrinho = new Carrinho("Franca E-Shop");

        // Agregar os produtos (Eles já existem)
        meuCarrinho.adicionarProduto(p1);
        meuCarrinho.adicionarProduto(p2);
        meuCarrinho.adicionarProduto(p3);

        // Compor 2 itens de venda (Criados a partir de dados brutos)
        meuCarrinho.gerarItem(101, 2, 150.0f); // 2 mouses
        meuCarrinho.gerarItem(102, 1, 900.0f); // 1 monitor

        // Imprimir estado final
        System.out.println(meuCarrinho.toString());
    }
}

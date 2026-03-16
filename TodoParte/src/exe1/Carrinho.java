package exe1;

import java.util.ArrayList;

public class Carrinho {
    private String nomeLoja;
    // Agregação: Lista de produtos que existem fora do carrinho
    private ArrayList<Produto> produtosAgregados;
    // Composição: Lista de itens que só existem dentro deste carrinho
    private ArrayList<ItemVenda> itensCompostos;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.produtosAgregados = new ArrayList<>();
        this.itensCompostos = new ArrayList<>();
    }

    // Parte 1: Implementação da Agregação (Recebe objeto pronto)
    public void adicionarProduto(Produto p) {
        this.produtosAgregados.add(p);
        System.out.println("Produto " + p.toString() + " agregado ao catálogo do carrinho.");
    }

    // Parte 2: Implementação da Composição (Cria o objeto internamente)
    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda novoItem = new ItemVenda(id, qtd, valor);
        this.itensCompostos.add(novoItem);
        System.out.println("Item de Venda " + id + " composto e armazenado no carrinho.");
    }

    public void removerItem(int id) {
        for (ItemVenda item : itensCompostos) {
            if (item.getId() == id) {
                itensCompostos.remove(item);
                System.out.println("Item " + id + " removido.");
                return;
            }
        }
        System.out.println("Item não encontrado.");
    }

    @Override
    public String toString() {
        return "\n--- " + nomeLoja.toUpperCase() + " ---\n" +
                "Produtos no Catálogo (Agregados): " + produtosAgregados + "\n" +
                "Itens da Compra Atual (Compostos): " + itensCompostos;
    }
}

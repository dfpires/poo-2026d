package exe1;

public class ItemVenda {
    private int id;
    private int quantidade;
    private float valorUnitario;

    public ItemVenda(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ItemVenda [ID=" + id + ", Qtd=" + quantidade + ", Valor Un.=R$" + valorUnitario + "]";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}

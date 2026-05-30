package fatecfranca.edu.produtos_db.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos_virtuais")
// Valor gravado na coluna "tipo" da tabela pai para este subtipo
@DiscriminatorValue("virtual")
public class ProdutoVirtual extends Produto {

    // campo exclusivo deste subtipo — fica na tabela produtos_virtuais
    private Boolean pago;

    public ProdutoVirtual() {}

    public Boolean getPago() { return pago; }
    public void setPago(Boolean pago) { this.pago = pago; }
}

package fatecfranca.edu.produtos_db.repository;

import fatecfranca.edu.produtos_db.model.ProdutoVirtual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoVirtualRepository extends JpaRepository<ProdutoVirtual, Long> {

    // consulta apenas produtos virtuais pelo status de pagamento
    List<ProdutoVirtual> findByPago(Boolean pago);
}

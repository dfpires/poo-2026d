package fatecfranca.edu.produtos_db.repository;

import fatecfranca.edu.produtos_db.model.ProdutoFisico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoFisicoRepository extends JpaRepository<ProdutoFisico, Long> {

    // consulta apenas produtos físicos com peso abaixo do informado
    List<ProdutoFisico> findByPesoLessThan(Float peso);
}

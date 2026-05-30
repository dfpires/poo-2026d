package fatecfranca.edu.produtos_db.repository;

import fatecfranca.edu.produtos_db.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findByNome(String nome);
}

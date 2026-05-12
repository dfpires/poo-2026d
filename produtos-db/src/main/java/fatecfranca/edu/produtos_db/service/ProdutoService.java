package fatecfranca.edu.produtos_db.service;

import fatecfranca.edu.produtos_db.model.Produto;
import fatecfranca.edu.produtos_db.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }
    // listar os produtos
    public List<Produto> listar(){
        return repo.findAll();
    }
    // buscar por id
    public Produto buscar(Long id){
        return repo.findById(id)
                .orElseThrow( () -> new RuntimeException("Não encontrado"));
    }
    @Transactional
    public Produto salvar(Produto p){
        return repo.save(p);
    }
    @Transactional
    public void remover(Long id){
        repo.deleteById(id);
    }
}

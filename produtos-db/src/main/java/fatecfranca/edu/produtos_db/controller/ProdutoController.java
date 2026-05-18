package fatecfranca.edu.produtos_db.controller;

import fatecfranca.edu.produtos_db.model.Produto;
import fatecfranca.edu.produtos_db.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;
    // injeção de dependência pelo construtor
    public ProdutoController(ProdutoService service){
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscar(id));
    }
    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        Produto salvo = service.salvar(produto);
        URI uri = URI.create("/produtos/" + salvo.getId());
        return ResponseEntity.created(uri).body(salvo);
    }
}

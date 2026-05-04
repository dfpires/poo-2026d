package fatecfranca.emmemoria.controller;

import fatecfranca.emmemoria.model.Produto;
import fatecfranca.emmemoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

// a classe é uma controladora de requisições
@RestController
// controla as requisições do endpoint /produtos
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired // injeção de dependência
    ProdutoService service;
    // vamos criar um método para o verbo GET
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){

        return ResponseEntity.ok(service.listar());
    }

    // método para o verbo POST
    @PostMapping
    public ResponseEntity<Produto> cria(@RequestBody Produto produto){
        Produto criado = service.cria(produto);
        // URI - Uniform Resource Identifier
        URI uri = URI.create("/produto/" + criado.getId());
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> remover(@PathVariable Long id){
        return ResponseEntity.ok(service.remover(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,
                                             @RequestBody Produto novo){
        Produto prod = service.atualiza(id, novo);
        return (prod != null) ? ResponseEntity.ok(prod) :
        ResponseEntity.notFound().build();
    }
}

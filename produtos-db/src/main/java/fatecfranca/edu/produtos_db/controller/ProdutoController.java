package fatecfranca.edu.produtos_db.controller;

import fatecfranca.edu.produtos_db.model.Produto;
import fatecfranca.edu.produtos_db.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;
    public ProdutoController(ProdutoService service){
            this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar());
    }
}

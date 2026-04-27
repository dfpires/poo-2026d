package fatecfranca.emmemoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// a classe é uma controladora de requisições
@RestController
// controla as requisições do endpoint /produtos
@RequestMapping("/produtos")

public class ProdutoController {
    // vamos criar um método para o verbo GET
    @GetMapping
    public String mensagem(){
        return "Hello World";
    }
}

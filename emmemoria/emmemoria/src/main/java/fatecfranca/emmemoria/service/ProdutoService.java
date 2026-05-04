package fatecfranca.emmemoria.service;

import fatecfranca.emmemoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    // cria a lista de produto
    List<Produto> lista = new ArrayList<Produto>();
    private Long nextInt = 1L;

    // retorna todos produtos da lista
    public List<Produto> listar(){
        return lista;
    }
    // adiciona um novo produto na lista
    public Produto cria(Produto novo){
        novo.setId(nextInt);
        nextInt++; // prepara a próxima adição
        lista.add(novo);
        return novo;
    }
}

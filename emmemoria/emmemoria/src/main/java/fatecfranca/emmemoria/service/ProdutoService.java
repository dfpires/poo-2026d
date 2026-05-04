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
    // remove um produto da lista
    public boolean remover(Long id){
        // removeIf
        for(Produto p: lista){
            if (p.getId().equals(id)){
                lista.remove(p); // remove
                return true;
            }
        }
        return false;// não encontrou
    }
    // atualiza um produto da lista
    public Produto atualiza(Long id, Produto novo){
        for(int i=0; i< lista.size(); i++){
            if (lista.get(i).getId().equals(id)){
                // achei
                novo.setId((id)); // coloco id encontrado no novo
                lista.set(i, novo); // atualiza na lista
                return novo;
            }
        }
        return null;
    }
}

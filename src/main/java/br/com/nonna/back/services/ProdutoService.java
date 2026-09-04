package br.com.nonna.back.services;

import br.com.nonna.back.models.Produto;
import br.com.nonna.back.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//alou git?

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> getTodosProdutos(){
        return this.repository.getTodosProdutos();
    }
}

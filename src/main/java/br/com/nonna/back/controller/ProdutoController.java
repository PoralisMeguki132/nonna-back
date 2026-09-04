package br.com.nonna.back.controller;

import br.com.nonna.back.models.Produto;
import br.com.nonna.back.services.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {
    private final ProdutoService service;

    ProdutoController(ProdutoService service){
        this.service = service;
    }

    @GetMapping("/produtos")
    List<Produto> getTodosProdutos() {
        return this.service.getTodosProdutos();
    }
}

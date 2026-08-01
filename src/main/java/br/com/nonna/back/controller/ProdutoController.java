package br.com.nonna.back.controller;

import br.com.nonna.back.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    List<Produto> listar(){

    }
}

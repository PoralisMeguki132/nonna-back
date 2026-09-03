package br.com.nonna.back.controller;

import br.com.nonna.back.models.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    Produto getTodosProdutos(){
        Produto exemplo = new Produto(
                "1",
                "pizza",
                "gostosa",
                new BigDecimal(15.3),
                "Pizzas"
        );

        return exemplo;
    }


    /* @GetMapping("/produtos")
    List<Produto> listar(){

    } */
}

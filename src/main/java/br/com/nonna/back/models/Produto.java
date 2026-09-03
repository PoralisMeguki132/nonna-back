package br.com.nonna.back.models;

import java.math.BigDecimal;

public class Produto {
    String id;
    String nome;
    String descricao;
    BigDecimal preco;
    String categoria;

    public Produto(String id, String nome, String descricao, BigDecimal preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}

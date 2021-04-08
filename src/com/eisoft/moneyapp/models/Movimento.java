package com.eisoft.moneyapp.models;

import java.util.Date;

public class Movimento {

    private float valor;
    private TipoMovimento tipoMovimento;
    private Categoria categoria;
    private String descricao;
    private Date data;

    public Movimento(float valor, Categoria categoria, String descricao) {
        this(valor, categoria, descricao, new Date());
    }

    public Movimento(float valor, Categoria categoria, String descricao, Date data) {
        this.valor = valor;
        tipoMovimento = (valor < 0) ? TipoMovimento.DESPESA : TipoMovimento.RECEITA;
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }
}


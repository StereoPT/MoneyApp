package com.eisoft.moneyapp.models;

import java.util.Date;

public class MovimentoRecorrente extends Movimento {

    private Date dataMovimento;

    public MovimentoRecorrente(float valor, Categoria categoria, String descricao, Date dataMovimento) {
        super(valor, categoria, descricao, new Date());
        this.dataMovimento = dataMovimento;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }
}
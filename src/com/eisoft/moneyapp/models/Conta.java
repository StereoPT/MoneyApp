package com.eisoft.moneyapp.models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Conta {
    public String nomeUtilizador;
    public float saldo;
    private ArrayList<Movimentos> movimentos;


    public Conta(String nomeUtilizador, float saldo) {
        this.nomeUtilizador = nomeUtilizador;
        this.saldo = saldo;
        this.movimentos = new ArrayList<Movimentos>();
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public float getSaldo() {
        return saldo;
    }

    public ArrayList<Movimentos> getMovimentos() {
        return movimentos;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void adicionarSaldo(float saldo){
        if (saldo <= 0) return;
        setSaldo(saldo + this.saldo);
    }

    public void subtrairSaldo(float saldo){
        if (saldo <= 0) return;
        setSaldo(saldo - this.saldo);
    }
}

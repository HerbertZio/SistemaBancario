package repository;

import strategy.Conta;

public class Cliente {
    private int id;
    private String nome;
    private Conta conta;

    public Cliente(int id, String nome, Conta conta) {
        this.id = id;
        this.nome = nome;
        this.conta = conta;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }
}

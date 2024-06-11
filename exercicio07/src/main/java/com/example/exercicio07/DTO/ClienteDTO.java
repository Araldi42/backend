package com.example.exercicio07.DTO;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class ClienteDTO {
    @NotNull
    private String nome;
    @NotNull
    private double saldo;
    @NotNull
    private String senha;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

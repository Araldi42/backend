package com.example.exercicio08.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class ClienteDTO {
    @NotNull
    @Size(min = 1, message = "Preencher o cliente é obrigatório.")
    private String nome;
    @NotNull(message = "Preencher o saldo é obrigatório.")
    private double saldo;
    @NotNull(message = "Preencher a senha é obrigatório.")
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

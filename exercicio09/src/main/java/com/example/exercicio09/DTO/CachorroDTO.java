package com.example.exercicio09.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.util.UUID;

public class CachorroDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotNull(message = "Preencher o nome é obrigatírio.")
    private String nome;
    @NotNull(message = "Preencher a raça é obrigatírio.")
    private String raca;
    @NotNull(message = "Preencher o peso é obrigatírio.")
    private double peso;
    @NotNull(message = "Preencher o sexo é obrigatírio.")
    @Max(1)
    private String sexo;
    @NotNull(message = "Preencher a idade é obrigatírio.")
    @Min(0)
    private int idade;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
